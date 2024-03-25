package test;
import exercises.Kata;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class KataTest {
    @Test
    public void testWithMyName() {
        assertEquals("Hello, Caio how are you doing today?", Kata.greet("Caio"));
    }
}
