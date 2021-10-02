package ch05;

public class MethodExample {

        //               ↓  메소드명(호출하기위한 네이밍)
    public static void main(String[] args) {//메소드
        //          ↑ 리턴타입     ↑ 파라미터(매개변수)
        //      void(x) 비 void(output 있음)
        //       -------------------------
        //             메소드 선언부 ↑
        //--------------------------------------
        //             메소드 구현부 ↓
        //
        //
        //--------------------------------------
        sum(10, 20);
        sum(50, 120);
        minus(100, 50);
        //    ------
        //   아규먼트

    }

    public static void sum(int n1, int n2) {//선언부
        System.out.println("sum : " + (n1 + n2));//구현부

    }
    public static void minus(int n1, int n2) {
        System.out.println("minus : " + (n1 - n2));
        System.out.printf("minus : %d - %d = %d", n1, n2, (n1-n2));
    }
}
