package ch04;

public class BreakExample {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {

            if (i == 50) {
                break;
            }
            System.out.println(i);
        }
    }
}
