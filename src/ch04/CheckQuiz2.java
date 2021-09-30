package ch04;

public class CheckQuiz2 {
    public static void main (String[] args) {
        while(true) {
            int num1 = (int)(Math.random() * 6) + 1;
            int num2 = (int)(Math.random() * 6) + 1;
            System.out.printf("(%d, %d)", num1, num2);
            System.out.println();
            if ((num1 + num2) == 5) {
                break;
            }
        }
    }

}
