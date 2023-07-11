public class Play {
    // 공격팀
    // 수비팀

    public void playgame(int ground) { // 게임 메소드 선언
        System.out.println(ground + "episode"); // 몇회초? 몇회말
        System.out.println("-------GAME START-------");
        int strike = 0; // 3 strike -> strike인데 안쳤음 -> +1 // 3strike == 1OUT
        int ball = 0; // 4 ball -> ball인데 안쳤음 -> +1
        // 초 : 상대팀 - 공격 <-> 두산 - 수비
        int out = 0; // 3 OUT -> Change
        int base = 0;
        while(out < 3){
            System.out.println("-----------------");
            Attack attack = new Attack();
            attack.setPitch();
            System.out.println(attack.getPitch()); // 스트라이크 0 볼 1
            int attack_res = attack.getPitch(); // 스트라이크 0 볼 1

            Defence defence = new Defence();
            defence.setHit();;
            System.out.println(defence.getHit()); // hit 0 no 1
            int defence_res = defence.getHit();

            if (attack_res == 0 && defence_res == 0){// 스트라이크 hit : 1루 전진 (출루)
                base += 1;
            } else if (attack_res == 0 && defence_res == 1){// 스트라이크 no : strike += 1
                strike += 1;
            } else if (attack_res == 1 && defence_res == 0){// ball hit : strike += 1
                strike += 1;
            } else if (attack_res == 1 && defence_res == 1){// ball no : ball += 1
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
            System.out.println(strike +" "+ ball +" "+ out);

        }
    }




}
