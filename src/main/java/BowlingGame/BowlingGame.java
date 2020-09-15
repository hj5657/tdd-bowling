package BowlingGame;

/**
 * Create by 木水 on 2020/9/14.
 */
public class BowlingGame {
    private int totalScore=0;
    private int cnt=1;
    public int getTotal() {
        return totalScore;
    }

    public void addEachNumber(int[] number) {
        for (int i = 1; i <number.length ; i++) {
            if (cnt<10) {
                if (number[i] == 10) {
                    cnt++;
                    totalScore += 10;
                    totalScore = totalScore + number[i + 1] + number[i + 2];
                }
                if (number[i]+number[i+1]==10){
                    cnt++;
                    totalScore+=10;
                    totalScore+=number[i+2];
                }
                if (number[i]+number[i+1]<10){
                    cnt++;
                    totalScore=totalScore+number[i]+number[i+1];
                }
            }else{
                totalScore+=number[i];
            }
        }
    }
}
