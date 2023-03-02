package Wisielec;

import java.util.*;

public class Wisielec {
    private String wordToGuess;
    private Set<Character> guessedLetters;
    private int amountOfLives;
    private static final int MAX_ATTEMPTS = 6;

    public Wisielec() {
    }

    public Wisielec(String wordToGuess) {
        this.wordToGuess = wordToGuess.toLowerCase();
        guessedLetters = new HashSet<>();
        amountOfLives = MAX_ATTEMPTS;
    }

    public boolean isGameOver() {
        return isGameLost() || isGameWon();
    }

    public boolean isGameLost() {
        return amountOfLives == 0;
    }

    public boolean isGameWon() {
        for (int i = 0; i < wordToGuess.length(); i++) {
            if (!guessedLetters.contains(wordToGuess.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public void makeGuess(char letter) {
        letter = Character.toLowerCase(letter);
        if (!guessedLetters.contains(letter)) {
            guessedLetters.add(letter);
            if (wordToGuess.indexOf(letter) == -1) {
                amountOfLives--;
            }
        }
    }

    public String getGuessedWord() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < wordToGuess.length(); i++) {
            char c = wordToGuess.charAt(i);
            if (guessedLetters.contains(c)) {
                sb.append(c);
            } else {
                sb.append("_");
            }
            sb.append(" ");
        }
        return sb.toString();
    }

    public int getAmountOfLives() {
        return amountOfLives;
    }

    public String getWordToGuess() {
        return wordToGuess;
    }

    public void startNewGame() {

        Scanner scanner = new Scanner(System.in);
        while (!isGameOver()) {
            System.out.println("Twoje słowo do odgadnięcia: " + getGuessedWord());
            System.out.println("Liczba żyć: " + getAmountOfLives());
            System.out.println("Podaj literę:");
            String input = scanner.nextLine();
            if (input.length() != 1) {
                System.out.println("Podaj dokładnie jedną literę!");
                continue;
            }
            char letter = input.charAt(0);
            makeGuess(letter);
        }

        if (isGameWon()) {
            System.out.println("Gratulacje, odgadłeś słowo \""+ getWordToGuess()+"\"!");
        } else {
            System.out.println("Niestety, przegrałeś. Szukane słowo to: " + getWordToGuess());
        }
    }


}
