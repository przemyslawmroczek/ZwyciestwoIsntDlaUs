package Palindrom;

public class Palindrom {

    public static boolean palindrome(char[] word) {
        int length = word.length;
        int middle = length / 2;
        for (int i = 0; i < middle; i++) {
            if (word[i] != word[length - i - 1]) {
                return false;
            }
        }
        return true;
    }

}
