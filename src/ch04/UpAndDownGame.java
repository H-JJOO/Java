package ch04;

import java.util.Scanner;

public class UpAndDownGame {
    public static void main (String[] args) {
        System.out.println("Up % Down Game!!");//게임시작을 알리는 문구
        Scanner scan = new Scanner(System.in);//스캐너 객체 생성
        //1~100
        int target = (int)(Math.random() * 100) + 1;//1~100랜덤한 숫자
        int val = 0, cnt = 0;//입력값, 시도횟수
        //System.out.println("target :" + target);//target 확인
        while (true) {//반복문
            cnt++;//시도횟수 증가(최초 0 -> 1)
            System.out.print("숫자를 입력해 주세요 : ");//예측숫자입력
            val = scan.nextInt();//val 에 사용자가 입력하게 도와줌

            if (val == target) {//입력한 val 가 랜덤으로 나온 target 과 같다면
                break;//게임종료
            } else if (val > target) {//다르고 val가 target 보다 클때
                System.out.println("Down");//Down 이라고 해주고
            } else {//다르고 val 가 target 보다 작을때
                System.out.println("Up");//Up 이라고 해준다.
            }
        }
        System.out.printf("게임 끝! %d번 걸림", cnt);//val 과 target 이 같아서 break 로 나오면 게임종료 알림
    }
}
