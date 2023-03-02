package Prime;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimesTest {

    private Primes primes = new Primes();

    @Test
    public void testPrimeZero() {
        assertEquals(0, primes.prime(0));
    }

    @Test
    public void testPrimeOne() {
        assertEquals(0, primes.prime(1));
    }

    @Test
    public void testPrimeTwo() {
        assertEquals(0, primes.prime(2));
    }

    @Test
    public void testPrimeThree() {
        assertEquals(1, primes.prime(3));
    }

    @Test
    public void testPrimeTen() {
        assertEquals(4, primes.prime(10));
    }

    @Test
    public void testPrimeHundred() {
        assertEquals(25, primes.prime(100));
    }
}