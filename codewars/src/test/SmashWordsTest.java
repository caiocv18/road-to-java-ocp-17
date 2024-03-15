package test;

import static org.junit.Assert.*;

import org.junit.Test;
import exercises.SmashWords;

public class SmashWordsTest {

    @Test
    public void validate() {
        assertEquals("Bilal Djaghout", SmashWords.smash("Bilal", "Djaghout"));
        assertEquals("hello world", SmashWords.smash("hello", "world"));
        assertEquals("hello amazing world", SmashWords.smash("hello", "amazing", "world"));
    }

    @Test
    public void validateEmpty() {
        assertEquals("", SmashWords.smash());
    }


    @Test
    public void validateOneWord() {
        assertEquals("Bilal", SmashWords.smash("Bilal"));
        assertEquals("Test", SmashWords.smash("Test"));
    }

}
