package ch03;

public class OperatorExample {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 10;

        int result = n1 + n2;
        System.out.println("n1 + n2 = " + result);

        System.out.println();

        // 10 + 3 = 13

        System.out.println(n1 + " + " + n2 + " = " + result);

        System.out.printf("%d + %d = %d", n1, n2, result);

        System.out.println();

        //단항 연산자
        result = n1 + (-n2);
        System.out.printf("%d + -%d = %d\n", n1, n2, result);

        System.out.println();

        //비교 연산자
        boolean result2 = n1 > n2;
        System.out.printf("%d > %d = %b\n", n1, n2, result2);

        System.out.printf("%d < %d = %b\n", n1, n2, n1 < n2);

        System.out.printf("%d >= %d = %b\n", n1, n2, n1 >= n2);

        System.out.printf("%d <= %d = %b\n", n1, n2, n1 <= n2);

        System.out.println();

        System.out.printf("%d == %d = %b\n", n1, n2, n1 == n2);

        System.out.printf("%d != %d = %b\n", n1, n2, n1 != n2);

    }
}
