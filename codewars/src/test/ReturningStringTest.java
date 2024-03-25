package test;
import exercises.ReturningString;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ReturningStringTest{
    @Test
    public void testWithMyName() {
        assertEquals("Hello, Caio how are you doing today?", ReturningString.greet("Caio"));
    }
}
