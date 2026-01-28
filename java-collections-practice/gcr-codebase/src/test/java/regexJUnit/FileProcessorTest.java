package regexJUnit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import regexJUnit.JUnit.FileProcessor;

import java.io.*;
import java.nio.file.*;

public class FileProcessorTest {

    private final String fileName = "testfile.txt";
    private final String content = "Hello JUnit File Test";

    @Test
    void testWriteAndReadFile() throws Exception {
        FileProcessor.writeToFile(fileName, content);
        String data = FileProcessor.readFromFile(fileName);
        assertEquals(content, data);
    }

    @Test
    void testFileExistsAfterWrite() throws Exception {
        FileProcessor.writeToFile(fileName, content);
        assertTrue(Files.exists(Paths.get(fileName)));
    }

    @Test
    void testReadFileNotExists() {
        assertThrows(IOException.class, () -> {
            FileProcessor.readFromFile("nofile.txt");
        });
    }

    @AfterEach
    void cleanup() throws Exception {
        Files.deleteIfExists(Paths.get(fileName));
    }
}
