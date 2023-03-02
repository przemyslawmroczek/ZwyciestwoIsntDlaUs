package Palindrom;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PalindromTest {

    private Palindrom palindrom;

        @Test
        public void testPalindrome_OddLength() {
            char[] word = {'r', 'a', 'd', 'a', 'r'};
            assertTrue(palindrom.palindrome(word));
        }

        @Test
        public void testPalindrome_EvenLength() {
            char[] word = {'r', 'o', 't', 'o', 'r'};
            assertTrue(palindrom.palindrome(word));
        }

        @Test
        public void testPalindrome_NonPalindrome() {
            char[] word = {'a', 'b', 'c', 'd', 'e'};
            assertFalse(palindrom.palindrome(word));
        }

        @Test
        public void testPalindrome_SingleCharacter() {
            char[] word = {'a'};
            assertTrue(palindrom.palindrome(word));
        }
    }