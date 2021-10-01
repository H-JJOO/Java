package ch05;

import java.util.Scanner;

public class ArrayTest2 {
    /*
        숫자 3개를 입력해주세요.
        숫자1 :
        숫자2 :
        숫자3 :

        합계 :
        평균 :
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//스캐너 객체 생성
        System.out.print("몇 개의 숫자를 사용할 것 입니까? : ");//사용자 적용
        int LEN = scan.nextInt();//외부입력값 대입

        int[] numberArr = new int[LEN];//빈배열생성

        System.out.printf("숫자 %d개를 입력해 주세요.\n", numberArr.length);

        for (int i = 0; i < numberArr.length; i++) {
            System.out.printf("숫자%d : ", (i+1));
            numberArr[i] = scan.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < numberArr.length; i++) {
            sum += numberArr[i];
        }

        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + (float)sum / numberArr.length);


    }
}
