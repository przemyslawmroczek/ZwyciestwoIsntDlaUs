package Wisielec;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;


public class WisielecTest {

    @Test
    public void testIsGameWon() {
        Wisielec game = new Wisielec("test");
        assertFalse(game.isGameWon());
        game.makeGuess('t');
        assertFalse(game.isGameWon());
        game.makeGuess('e');
        assertFalse(game.isGameWon());
        game.makeGuess('s');
        assertTrue(game.isGameWon());
    }

    @Test
    public void testIsGameOver() {
        Wisielec game = new Wisielec("test");
        assertFalse(game.isGameOver());
        game.makeGuess('a');
        assertFalse(game.isGameOver());
        game.makeGuess('b');
        assertFalse(game.isGameOver());
        game.makeGuess('c');
        assertFalse(game.isGameOver());
        game.makeGuess('d');
        assertFalse(game.isGameOver());
        game.makeGuess('f');
        assertFalse(game.isGameOver());
        game.makeGuess('g');
        assertTrue(game.isGameOver());
    }
}