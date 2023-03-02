package Suma;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SumaTest {

    private Suma suma;

    @Test
    public void testAdd() {
        assertEquals(5, suma.add(2, 3));
        assertEquals(10, suma.add(5, 5));
        assertEquals(0, suma.add(0, 0));
        assertEquals(-3, suma.add(-5, 2));
        assertEquals(2147483647, suma.add(2147483646, 1));
        assertEquals(-2147483648, suma.add(-2147483647, -1));
    }
}