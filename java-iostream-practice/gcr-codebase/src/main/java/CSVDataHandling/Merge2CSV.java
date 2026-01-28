package CSVDataHandling;
import java.util.*;
import java.io.*;

public class Merge2CSV {

	public static void main(String[] args) {
		String file1 = "D:\\BridgeLabz-Training\\java-iostream-practice\\gcr-codebase\\src\\main\\resources\\data.csv";
		String file2 = "D:\\BridgeLabz-Training\\java-iostream-practice\\gcr-codebase\\src\\main\\resources\\student.csv";
		String outputFile = "D:\\BridgeLabz-Training\\java-iostream-practice\\gcr-codebase\\src\\resources\\CSVDataHandling\\merged.csv";

		Map<String, String[]> studentData = new HashMap<>();

		try (BufferedReader br1 = new BufferedReader(new FileReader(file1))) {
			String line;
			while ((line = br1.readLine()) != null) {
				String[] parts = line.split(",");
				if (parts.length == 3) {
					studentData.put(parts[0], new String[]{parts[1], parts[2]});
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (BufferedReader br2 = new BufferedReader(new FileReader(file2))) {
			String line;
			while ((line = br2.readLine()) != null) {
				String[] parts = line.split(",");
				if (parts.length == 3) {
					String id = parts[0];
					if (studentData.containsKey(id)) {
						String[] existingData = studentData.get(id);
						studentData.put(id, new String[]{existingData[0], existingData[1], parts[1], parts[2]});
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
			for (Map.Entry<String, String[]> entry : studentData.entrySet()) {
				String id = entry.getKey();
				String[] details = entry.getValue();
				if (details.length == 4) {
					bw.write(id + "," + details[0] + "," + details[1] + "," + details[2] + "," + details[3]);
					bw.newLine();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Merged data written to : " + outputFile);

	}

}
