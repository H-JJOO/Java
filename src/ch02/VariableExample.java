package ch02;

public class VariableExample {

    public static void main(String[] args) {

        byte b;
        short s ;
        int score;//변수선언(변수와 반대되는것은 상수), 변수는 잠시 값을 저장해두고 싶어서 쓰는 것, int(변수타입, 정수, 실수와 정수의 차이! 정수는 소수점을 절대로 가질수 없다. 실수는 가질수 있다.),
        long l;
        score = 10;//'=' 오른쪽의 값을 복사하여 왼쪽에 넣어준다.
        System.out.println(score);
        System.out.println(10);

        score = 20;
        System.out.println(score);
        System.out.println(20);

        System.out.println(score + score);
        System.out.println(score);

        score = score + score + score;
        System.out.println(score);

        short s1 = -129;
        byte b1 = (byte)s1;
        System.out.println(b1);

        final int score2 = 10;//상수
        //score2 = 12; //상수이기때문에 값을 바꿔줄수 없다.

    }
}
