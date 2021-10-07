package other;

import java.util.Scanner;

public class GameMergeNinjaStarBurningMode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int tSum = 0;
        int t = 0;
        int time = 0;
        int lv = 0;
        System.out.println("[버닝모드 횟수에 따른 루비 소모 갯수, 버닝모드 시간 확인 프로그램]");
        System.out.print("버닝모드를 실행 횟수를 입력해주세요.(숫자만 입력) : ");
        t = scanner.nextInt();
        System.out.print("버닝모드 LV. 을 입력해주세요.(숫자만 입력) :  ");
        lv = scanner.nextInt();
        System.out.println("버닝모드 LV. : " + "LV." + lv );
        System.out.println("버닝모드 횟수 : " +t + "회");
        int[] tn = new int[t];

        for (int i = 0;  i < tn.length; i++) {
            sum += i*20;
        }

        for (int i = 0; i < tn.length; i++) {
            if (lv < 100) {
                tSum = time + i*30;
            } else if (lv < 200) {
                tSum = time + i*31;
            } else if (lv < 300) {
                tSum = time + i*32;
            } else if (lv < 400) {
                tSum = time + i*33;
            } else if (lv < 500) {
                tSum = time + i*34;
            } else if (lv < 600) {
                tSum = time + i*35;
            } else if (lv < 700) {
                tSum = time + i*36;
            }

        }
        System.out.println("소모 루비 갯수 : " + sum + "개");
        System.out.println("버닝모드 시간 : " + tSum + "초");
    }
}
//0 20 40 80 100 120 140 160 180 200