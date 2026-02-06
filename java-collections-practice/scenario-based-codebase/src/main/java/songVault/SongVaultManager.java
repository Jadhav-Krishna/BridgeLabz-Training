package songVault;

import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

public class SongVaultManager<T extends Media> {

    private List<T> songs = new ArrayList<>();
    private Map<String, List<T>> genreMap = new HashMap<>();
    private Set<String> uniqueArtists = new HashSet<>();

    private static final Pattern TITLE_PATTERN = Pattern.compile("^Title:\\s*(.*)");
    private static final Pattern ARTIST_PATTERN = Pattern.compile("^Artist:\\s*(.*)");
    private static final Pattern DURATION_PATTERN = Pattern.compile("^Duration:\\s*(.*)");
    private static final Pattern GENRE_PATTERN = Pattern.compile("^Genre:\\s*(.*)");

    public void loadSongsFromFolder(String folderPath) {

        songs.clear();
        genreMap.clear();
        uniqueArtists.clear();

        File folder = new File(folderPath);

        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println(" Folder does not exist: " + folderPath);
            return;
        }

        File[] files = folder.listFiles((dir, name) -> name.endsWith(".txt"));

        if (files == null || files.length == 0) {
            System.out.println("️ No .txt song files found in folder.");
            return;
        }

        for (File file : files) {
            try {
                processSongFile(file);
            } catch (Exception e) {
                System.out.println("️ Skipping invalid song file: " + file.getName());
            }
        }

        System.out.println("\n Loaded " + songs.size() + " songs successfully.");
    }

    private void processSongFile(File file) throws IOException {

        String title = null, artist = null, duration = null, genre = null;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line;

            while ((line = br.readLine()) != null) {

                line = line.trim();

                Matcher m;

                m = TITLE_PATTERN.matcher(line);
                if (m.matches()) {
                    title = m.group(1);
                    continue;
                }

                m = ARTIST_PATTERN.matcher(line);
                if (m.matches()) {
                    artist = m.group(1);
                    continue;
                }

                m = DURATION_PATTERN.matcher(line);
                if (m.matches()) {
                    duration = m.group(1);
                    continue;
                }

                m = GENRE_PATTERN.matcher(line);
                if (m.matches()) {
                    genre = m.group(1);
                }
            }
        }

        if (title == null || artist == null || duration == null || genre == null) {
            throw new IllegalArgumentException("Missing fields in " + file.getName());
        }

        @SuppressWarnings("unchecked")
        T song = (T) new Song(title, artist, duration, genre);

        songs.add(song);

        uniqueArtists.add(song.getArtist());

        genreMap.computeIfAbsent(song.getGenre(), k -> new ArrayList<>()).add(song);

        System.out.println("Loaded: " + song.getTitle());
    }

    public void displayAllSongs() {

        System.out.println("\n🎵 All Songs:");

        songs.forEach(System.out::println);
    }

    public void displayByGenre() {

        System.out.println("\n Songs Grouped by Genre:");

        for (Map.Entry<String, List<T>> entry : genreMap.entrySet()) {

            System.out.println("\nGenre: " + entry.getKey());

            for (T song : entry.getValue()) {
                System.out.println("  " + song);
            }
        }
    }

    public void displayUniqueArtists() {

        System.out.println("\n Unique Artists:");

        uniqueArtists.forEach(artist -> System.out.println(" - " + artist));
    }

    public void filterByArtist(String artistName) {

        System.out.println("\n Songs by Artist: " + artistName);

        songs.stream()
                .filter(s -> s.getArtist().equalsIgnoreCase(artistName))
                .forEach(System.out::println);
    }

    public void sortByTitle() {

        System.out.println("\n Songs Sorted by Title:");

        songs.stream()
                .sorted(Comparator.comparing(Media::getTitle))
                .forEach(System.out::println);
    }
}