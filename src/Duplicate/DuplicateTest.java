package Duplicate;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DuplicateTest {

    private Duplicate duplicates;

    @Test
    public void testNoDuplicates() {
        char[] word = {'a', 'b', 'c', 'd', 'e'};
        int result = duplicates.duplicates(word);
        assertEquals(0, result);
    }

    @Test
    public void testTwoDuplicates() {
        char[] word = {'a', 'a', 'b', 'b', 'c', 'd', 'e'};
        int result = duplicates.duplicates(word);
        assertEquals(2, result);
    }

    @Test
    public void testAllDuplicates() {
        char[] word = {'a', 'a', 'a', 'a', 'a', 'a', 'a'};
        int result = duplicates.duplicates(word);
        assertEquals(1, result);
    }

    @Test
    public void testEmptyArray() {
        char[] word = {};
        int result = duplicates.duplicates(word);
        assertEquals(0, result);
    }
    

    //Important test
    @Test
    public void testMultipleDuplicates_WhenDanePodaneFromAdam_ARCYTEST() {
        char[] word = {'a', 'a', 'b', 'c', 'd', 'b', 'e', 'a', 'a'};
        int result = duplicates.duplicates(word);
        assertEquals(2, result);
    }
}