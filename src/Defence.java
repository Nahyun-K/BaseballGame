import java.util.Random;

public class Defence {
    // 치기 0 안치기 1
    private int hit;

    public int getHit() {
        return hit;
    }

    public void setHit() {
        Random rd = new Random();
        this.hit = rd.nextInt(2);
//        this.hit = hit;
    }

    @Override
    public String toString() {
        return "Defence{" +
                "hit=" + hit +
                '}';
    }
}
