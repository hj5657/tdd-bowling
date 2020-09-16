package twu;

import BowlingGame.BowlingGame;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BowlingGameTest {
    @Test
    void should_return_300score_when_all_is_strike() {
        BowlingGame game = new BowlingGame();
        int number[] = new int[13];
        for (int i = 1; i < 13; i++) {
            number[i] = 10;
        }
        game.addEachNumber(number);
        int result = game.getTotal();
        Assertions.assertEquals(300, result);
    }

    @Test
    void should_return_0score_when_all_is_zero() {
        BowlingGame game = new BowlingGame();
        int number[] = new int[21];
        for (int i = 1; i < number.length; i++) {
            number[i] = 0;
        }
        game.addEachNumber(number);
        int result = game.getTotal();
        Assertions.assertEquals(0, result);
    }

    @Test
    void should_return_score_when_both_have_strike_and_spare() {
        BowlingGame game = new BowlingGame();
        int number[] = {0, 10, 3, 6, 9, 1, 5, 5, 10, 8, 1, 10, 10, 10, 10, 3, 6};
        game.addEachNumber(number);
        int result = game.getTotal();
        Assertions.assertEquals(193, result);
    }
}
