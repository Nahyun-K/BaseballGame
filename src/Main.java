import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        String[] competitor = new String[]{"LG -TWINS",
                "SSG -LANDERS",
                "LOTTE -GIANTS",
                "NC -DINOS",
                "KIA -TIGERS",
                "KIWOOM -HEROSE",
                "KT -WIZ",
                "HANWHA -EAGLES",
                "SAMSUNG -LIONS"};
        LocalDate now = LocalDate.now();
        System.out.println("KBO league " + now);
        System.out.println("My Team : Doosan Bears"); System.out.println();
        System.out.println("DOOSAN -BEARS       vs      "+competitor[rd.nextInt(9)]);
        int p, c;
        String BASEMAN, FIELDER;
        System.out.println("Choose Player!!(Line UP)"); // 선수를 선택하세요
        System.out.println();
        System.out.print("Pitcher : "); // 투수
        p = sc.nextInt();
        Player pitcher = new Player(p, "Pitcher");
        System.out.println(pitcher.toString()); System.out.println();
        System.out.print("Catcher : "); // 포수
        c = sc.nextInt();
        Player catcher = new Player(c, "Catcher");
        System.out.println(catcher.toString()); System.out.println();
        sc.nextLine(); // 개행 문자 제거
        System.out.print("First, Second, Third baseman, Shortstop : "); // 1루수 2루수 3루수
        BASEMAN = sc.nextLine();
        String[] base = BASEMAN.split(" ");
        Player[] baseman = new Player[base.length];
        for(int i=0; i<base.length; i++){
            baseman[i] = new Player(Integer.parseInt(base[i]), "Baseman");
            System.out.println(baseman[i].toString());
        }
        System.out.println();
        System.out.print("Left, Center, Right fielder : "); // 외야수
        FIELDER = sc.nextLine();
        String[] field = FIELDER.split(" ");
        Player[] fielder = new Player[field.length];
        for(int i=0; i<field.length; i++){
            fielder[i] = new Player(Integer.parseInt(field[i]), "fielder");
            System.out.println(fielder[i].toString());
        }
        System.out.println();





    }
}
