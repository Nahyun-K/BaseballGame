import java.util.Scanner;

public class Play {
    Scanner sc = new Scanner(System.in);
    // 수비팀
    public void defenderTeam(int ground) { // 게임 메소드 선언
        System.out.println(ground + "episode"); // 몇회초? 몇회말
        System.out.println("-------defender Team : Doosan-------");
        int strike = 0; // 3 strike -> strike인데 안쳤음 -> +1 // 3strike == 1OUT
        int ball = 0; // 4 ball -> ball인데 안쳤음 -> +1
        // 초 : 상대팀 - 공격 <-> 두산 - 수비
        int out = 0; // 3 OUT -> Change
        int base = 0;
        while(out < 3){
            System.out.println("-----------------");
            // 투수 : 두산 -> 공 뭐 던질지 고민
            int defence_res = -1;
            System.out.print("strike? (y / n) : ");
            String result = sc.nextLine();
            if (result.equals("y")){
                defence_res = 0;
                System.out.println("strike " + defence_res);
            } else if (result.equals("n")) {
                defence_res = 1;
                System.out.println("ball "+ defence_res);
            }

            Attack attack = new Attack();
            attack.setPitch();
            System.out.println(attack.getPitch()); // 스트라이크 0 볼 1
            int attack_res = attack.getPitch(); // 스트라이크 0 볼 1

            switch (attack_res) {
                case 0:
                    System.out.println("hit");
                    break;
                case 1:
                    System.out.println("no");
                    break;
            }

            if (defence_res == 0 && attack_res == 0){// 스트라이크 hit : 1루 전진 (출루)
                base += 1;
                strike = 0;
                ball = 0;
            } else if (defence_res == 0 && attack_res == 1){// 스트라이크 no : strike += 1
                strike += 1;
            } else if (defence_res == 1 && attack_res == 0){// ball hit : strike += 1
                strike += 1;
            } else if (defence_res == 1 && attack_res == 1){// ball no : ball += 1
                ball += 1;
            }

            if (strike == 3){
                strike = 0;
                out += 1;
                ball = 0;
            }
            if (ball == 4) {
                strike = 0;
                ball = 0;
            }
            System.out.println("strike: " + strike +" ball: "+ ball +" OUT: "+ out);

        }
    }

    // 공격팀
    public void strikerTeam(int ground) { // 게임 메소드 선언
        System.out.println(ground + "episode"); // 몇회초? 몇회말
        System.out.println("------striker Team : Doosan-------");
        int strike = 0; // 3 strike -> strike인데 안쳤음 -> +1 // 3strike == 1OUT
        int ball = 0; // 4 ball -> ball인데 안쳤음 -> +1
        // 초 : 상대팀 - 공격 <-> 두산 - 수비
        int out = 0; // 3 OUT -> Change
        int base = 0;
        while(out < 3){
            System.out.println("-----------------");
            // 투수 공 던짐 - 상대팀
            Defence defence = new Defence();
            defence.setHit();;
            System.out.println(defence.getHit()); // hit 0 no 1
            int defence_res = defence.getHit();
            if (defence_res == 0){
                System.out.println("strike : " + defence_res);
            } else if (defence_res == 1) {
                System.out.println("ball : " + defence_res);
            }
            // 두산
            int attack_res = -1;
            System.out.print("Hit? (y / n) : ");
            String result = sc.nextLine();
            if (result.equals("y")){
                attack_res = 0;
                System.out.println("hit " + attack_res);
            } else if (result.equals("n")) {
                attack_res = 1;
                System.out.println("no hit " + attack_res);
            }

//            Attack attack = new Attack();
//            attack.setPitch();
//            System.out.println(attack.getPitch()); // 스트라이크 0 볼 1
//            int attack_res = attack.getPitch(); // 스트라이크 0 볼 1


            if (defence_res == 0 && attack_res == 0){// 스트라이크 hit : 1루 전진 (출루)
                base += 1;
                strike = 0;
                ball = 0;
            } else if (defence_res == 0 && attack_res == 1){// 스트라이크 no : strike += 1
                strike += 1;
            } else if (defence_res == 1 && attack_res == 0){// ball hit : strike += 1
                strike += 1;
            } else if (defence_res == 1 && attack_res == 1){// ball no : ball += 1
                ball += 1;
            }

            if (strike == 3){
                strike = 0;
                out += 1;
                ball = 0;
            }
            if (ball == 4) {
                strike = 0;
                ball = 0;
            }
            System.out.println("strike: " + strike +" ball: "+ ball +" OUT: "+ out);

        }
    }




}
