package ch05;

public class MethodTest2 {
    public static void main(String[] args) {
        String oddEven = getOddEven(13);

        System.out.println("결과 : " + oddEven);
        // 10 > 짝수
        // 13 > 홀수
    }

    public static String getOddEven(int val) {
        if (val % 2 == 0) {
            return "짝수";
        }
            return "홀수";
    }
}
