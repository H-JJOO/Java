package ch03;

public class OperatorExample5 {
    public static void main(String[] args) {
        //삼항식(분기문)

        int n1 = 10;
        int n2 = 11;
        System.out.println(n1 >= n2 ? "n1이 n2랑 같거나 크다" : "n2가 n1보다 크다");//결과 타입은 String

        //mod(나머지, (2)홀짝구할때 쓰기 좋음)

        System.out.println(10 % 2);
        System.out.println(11 % 2);
        System.out.println(12 % 2);
        System.out.println(13 % 2);
    }
}
