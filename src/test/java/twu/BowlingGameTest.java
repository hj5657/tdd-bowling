package twu;

import BowlingGame.BowlingGame;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BowlingGameTest {
    @Test
    void should_return_300score_when_all_is_strike(){
        BowlingGame game=new BowlingGame();
        int number[]=new int[13];
        for (int i = 1; i < 13; i++) {
            number[i]=10;
        }
        game.addEachNumber(number);
        int result=game.getTotal();
        Assertions.assertEquals(300,result);
    }
}
