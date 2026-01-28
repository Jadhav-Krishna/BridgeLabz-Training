package regexJUnit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import regexJUnit.JUnit.PerformanceUtils;

import java.util.concurrent.TimeUnit;

public class PerformanceUtilsTest {

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    void testLongRunningTaskTimeout() {
        String result = PerformanceUtils.longRunningTask();
        assertEquals("DONE", result);
    }
}
