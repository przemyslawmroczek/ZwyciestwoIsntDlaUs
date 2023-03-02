package Duplicate;

public class Duplicate {
    public static int duplicates(char[] word) {
        int duplicateCount = 0;
        for (int i = 0; i < word.length; i++) {
            for (int j = i + 1; j < word.length; j++) {
                if (word[i] == word[j]) {
                    duplicateCount++;
                    break;
                }
            }
        }
        return duplicateCount;
    }
}
