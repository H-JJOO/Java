package ch03;

public class OperatorExample4 {
    public static void main(String[] args) {
        int n1 = 10;
        n1++;//1더해줌, 이런 식은 + - 만 사용가능, * % 안된다.
        ++n1;
        System.out.println(n1);
        n1--;//1빼줌
        System.out.println(n1);
        System.out.println("-----");

        int n2 = 40;
        System.out.println(n2++);//읽을때 차이가 생김, 먼저 40을 읽고나서 1이 올라간다.
        System.out.println(n2);//1이 올라가 있는 상태로 읽힌다.

        System.out.println(++n2);//읽기 전에 1 더해주고 읽는다.
        System.out.println(n2);//1이 올라가 있는 상태로 읽힌다.

        System.out.println("-----");
        int n3 = 50;
        n3 = n3 + 3;//53, 이런 식은 사칙연산 가능함
        n3 = n3 + 3;//56
        System.out.println("n3 : " + n3);

        System.out.println("-----");
        int n4 = 50;
        n4 += 3;//축약형
        n4 += 3;
        System.out.println("n4 : " + n4);

    }
}
