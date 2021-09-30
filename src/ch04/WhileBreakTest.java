package ch04;

import java.util.Scanner;

public class WhileBreakTest {
    /*
        숫자를 입력하세요 (정지:0) : 14
        숫자를 입력하세요 (정지:0) : 10
        숫자를 입력하세요 (정지:0) : 0

        더한 수 : 24
     */
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0, val = 0;

        while (true) {
            System.out.println("숫자를 입력하세요 (정지:0) : ");
            val = scan.nextInt();
            if (val == 0) {
                break;
            }
            sum += val;
        }
        System.out.println("합계 : " + sum);
    }
}
