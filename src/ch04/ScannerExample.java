package ch04;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//new : 실체화시켰다,
        System.out.println("나이를 입력하세요 : ");
        int age = scan.nextInt();
        System.out.println("나이 : " + age);//문자있으면 에러터짐
//Scanner : 외부에 있는 값을 프로그래밍 안쪽에 있는 변수에다가 값을 넣어줄수 있게 도와주는 객체
    }
}
