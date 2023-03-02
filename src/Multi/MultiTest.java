package Multi;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiTest {

private Multi multi = new Multi();

    @Test
   public void testZero() {
        int result = multi.multi(0, 10);
        assertEquals(0, result);
    }

    @Test
    public void testOne() {
        int result = multi.multi(1, 10);
        assertEquals(10, result);
    }

    @Test
    public void testNegative() {
        int result = multi.multi(-3, 5);
        assertEquals(-15, result);
    }

    @Test
    public void testLargeNumbers() {
        int result = multi.multi(12345, 6789);
        assertEquals(83810205, result);
    }
}