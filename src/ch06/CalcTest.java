package ch06;

public class CalcTest {
    public static void main(String[] args) {

        String str = "10";
        int intStr = Integer.parseInt(str);//10이라는 문자열을 정수 10으로 바꿔주는 메소드
        System.out.println(intStr + 10);

        int result = StaticCalc.sum(10, 20);
        System.out.println("static sum : " + result);

        Calc calc = new Calc();
        calc.n1 = 10;
        calc.n2 = 20;

        int result2 =calc.sum();
        System.out.println("instance sum : " + result2 );
    }
}
