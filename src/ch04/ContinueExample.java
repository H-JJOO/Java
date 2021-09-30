package ch04;

public class ContinueExample {
    public static void main (String[] args) {
        for (int i = 0; i<100; i++) {
            if (i == 50 || i == 55) {//&&는 성립자체가 안된다.
                continue;//skip
            }
            System.out.println(i);
        }
    }
}
