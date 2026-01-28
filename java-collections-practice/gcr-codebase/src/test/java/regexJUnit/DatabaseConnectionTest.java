package regexJUnit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import regexJUnit.JUnit.DatabaseConnection;

public class DatabaseConnectionTest {

    private DatabaseConnection db;

    @BeforeEach
    void setUp() {
        db = new DatabaseConnection();
        db.connect();
    }

    @AfterEach
    void tearDown() {
        db.disconnect();
    }

    @Test
    void testConnectionEstablished() {
        assertTrue(db.isConnected());
    }

    @Test
    void testConnectionClosedAfterTest() {
        assertTrue(db.isConnected());
    }
}
