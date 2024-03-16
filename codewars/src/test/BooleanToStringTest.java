package test;

import exercises.BooleanToString;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class BooleanToStringTest {
    @Test
    public void testTrue(){
        assertEquals("true", BooleanToString.convert(true));
    }

    @Test
    public void testFalse(){
        assertEquals("false", BooleanToString.convert(false));
    }
}
