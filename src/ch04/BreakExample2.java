package ch04;

public class BreakExample2 {
    public static void main (String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int z = 100; z < 110; z++) {
                if (z == 103) {
                    break;//안쪽 for문 박살
                }
                System.out.printf("%d - %d\n", i, z);

            }
        }

        System.out.println("----------------------------");

        OUT_FOR:
        for (int i = 0; i < 10; i++) {
            for (int z = 100; z < 110; z++) {
                if (z == 103) {
                    break OUT_FOR;//바깥 for문 박살
                }
                System.out.printf("%d - %d\n", i, z);

            }
        }
    }
}
