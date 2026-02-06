package chatLogParser;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ChatLogManager {

    private Map<String, List<String>> userMessages = new TreeMap<>();

    private static final Pattern CHAT_PATTERN = Pattern.compile("\\[(.*?)\\]\\s*(.*?):\\s*(.*)");

    public void processChatFile(String filePath, MessageFilter<ChatMessage> filter) {

        userMessages.clear();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            int lineNumber = 1;

            while ((line = br.readLine()) != null) {

                try {
                    processLine(line, filter);
                } catch (IllegalArgumentException e) {
                    System.out.println(" Line " + lineNumber + " skipped: " + e.getMessage());
                }

                lineNumber++;
            }

            System.out.println("\n Finished processing chat log.");

        } catch (IOException e) {
            System.out.println(" Error reading file: " + e.getMessage());
        }
    }

    private void processLine(String line, MessageFilter<ChatMessage> filter) {

        line = line.trim();

        if (line.isEmpty()) {
            throw new IllegalArgumentException("Empty line");
        }

        Matcher matcher = CHAT_PATTERN.matcher(line);

        if (!matcher.matches()) {
            throw new IllegalArgumentException("Invalid chat format -> " + line);
        }

        String timestamp = matcher.group(1);
        String user = matcher.group(2);
        String message = matcher.group(3);

        ChatMessage chatMessage = new ChatMessage(timestamp, user, message);

        if (!filter.allow(chatMessage)) {
            System.out.println(" Idle chat filtered: " + chatMessage);
            return;
        }
        userMessages.computeIfAbsent(user, k -> new ArrayList<>()).add(chatMessage.getMessage());

        System.out.println("Processed: " + chatMessage);
    }

    public void displayByUser() {

        System.out.println("\n Messages Grouped by User (Sorted):");

        for (Map.Entry<String, List<String>> entry : userMessages.entrySet()) {

            System.out.println("\nUser: " + entry.getKey());

            for (String msg : entry.getValue()) {
                System.out.println("  - " + msg);
            }
        }
    }
}