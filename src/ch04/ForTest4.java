package ch04;

public class ForTest4 {
    public static void main (String[] args) {
        // 2 x 1 = 2    3 x 1 = 3   4 x 1 = 4 ... 9 x 1 = 9
        // 2 x 2 = 4    3 x 2 = 6   4 x 2 = 8 ... 9 x 2 = 18
        // ...
        // 2 x 9 = 18

        for (int i = 1; i < 10; i++) {
            for (int z = 2; z < 10; z++) {
                System.out.printf("%d x %d = %d\t", z, i, (z * i));
            }
            System.out.println();
        }
    }

}
