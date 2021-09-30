package ch04;

public class ForTest {
    public static void main (String[] args) {
        // int dan 은 main {} 안에서 하나만 사용가능(scope)
        int dan = (int)(Math.random() * 8) + 2; //2~9

        // int i 는 for {} 안에서 하나만 사용가능(scope)
        for (int i=1;i<10;i++) {
            System.out.printf("%d x %d = %d", dan, i, dan * i);
            System.out.println();
        }
        for (int i=10;i<19;i++) {
            System.out.printf("%d x %d = %d", dan, i-9, dan * (i-9));
            System.out.println();
        }

    }
}
