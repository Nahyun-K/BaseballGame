import java.util.Random;

public class Attack {
    // 스트라이크 : 0  /  볼 : 1
    private int pitch; // 공을 던지다

    public void setPitch() {
        Random rd = new Random();
        this.pitch = rd.nextInt(2);
//        this.pitch = pitch;
    }

    public int getPitch() {
        return pitch;
    }

    @Override
    public String toString() {
        return "Attack{" +
                "pitch=" + pitch +
                '}';
    }
}
