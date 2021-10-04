package ch06;

public class Computer {
    static String brand;//공용변수, 오로지 한개만 저장된다.(스테틱 변수), 스스로 메모리에 올라간다.
    int cpu;//객체별로 다른 값을 저장할수 있다.(인스턴스 객체 변수), 일부로 메모리에 올려줘야한다.

    public void print() {//Computer 을 인스턴스화 객체화 해주니까 문제될것이 없다.
        System.out.printf("컴퓨터 브랜드는 %s이고, cpu는 %d입니다.", brand, cpu);
    }

    public static void print2() {//객체화는 static 보다 빠를수가 없다.//멤버변수에 static이 없으면 메소드에 static을 사용할수 없다.
        System.out.printf("컴퓨터 브랜드는 %s이고, cpu는 %d입니다.", brand);//여기에 cpu 값 들어가면 오류 발생
    }

}
