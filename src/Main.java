import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        // 선발
        LineUp lineUp = new LineUp();
        lineUp.pickPlayer();

        //  경기 시작 
        Play play = new Play();
        play.defenderTeam(1);
//        play.strikerTeam(1);




    }
}
