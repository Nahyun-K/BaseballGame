import java.util.Random;

public class Catchball implements Ball{
    // 스트라이크 : 0  /  볼 : 1
    private int ball; // 공을 던지다

    @Override
    public int getBall() {
        return ball;
    }

    @Override
    public void setBall() {
        Random rd = new Random();
        this.ball = rd.nextInt(HIT_COUNT);
    }

}
