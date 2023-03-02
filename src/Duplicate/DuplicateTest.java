package Duplicate;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DuplicateTest {

    private Duplicate duplicates;

    @Test
    public void testDuplicatesNoDuplicates() {
        assertEquals(0, duplicates.duplicates(new char[]{'a', 'b', 'c', 'd', 'e'}));
    }

    @Test
    public void testDuplicatesMultipleDuplicates() {
        assertEquals(3, duplicates.duplicates(new char[]{'a', 'a', 'b', 'b', 'c', 'd', 'd', 'e'}));
    }
}