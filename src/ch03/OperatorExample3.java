package ch03;

public class OperatorExample3 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 10;
        int n3 = 20;
        int n4 = 20;

        boolean result1 = n1 >= n2;//true
        boolean result2 = n3 > n4;//false

        System.out.println(result1 && result2);//둘다 true 여야 true, 둘중 하나라도 false 라면 false
        System.out.println(result1 || result2);//둘다 false 여야 false, 둘중 하나라도 true 라면 true

        System.out.println(true && true && false && true && true);
        System.out.println(n1 >= n2 || n3 < n4 || n1 <n4);


    }
}
