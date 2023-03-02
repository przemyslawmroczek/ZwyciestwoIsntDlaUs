package Duplicate;

import java.util.HashSet;
import java.util.Set;

public class Duplicate {
    public static int duplicates(char[] word) {
        Set<Character> uniqueChars = new HashSet<>();
        Set<Character> duplicateChars = new HashSet<>();

        for (char c : word) {
            if (uniqueChars.contains(c)) {
                duplicateChars.add(c);
            } else {
                uniqueChars.add(c);
            }
        }

        return duplicateChars.size();
    }
}
