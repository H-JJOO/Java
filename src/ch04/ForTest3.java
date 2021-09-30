package ch04;

public class ForTest3 {
    public static void main (String[] args) {
        // 2 x 1 = 2
        // 2 x 2 = 4
        // ...
        // 3 x 1 = 3
        // 3 x 2 = 6
        // ...
        // 9 x 9 = 81

        //뭔가 역할을 하는 숫자 magic number, 는 변수를 주는게 좋다.
        for (int i =2; i<10; i++) {
            if (i!=2) {//센스...
                System.out.println("--------------");
            }
            for (int z =1; z<10; z++) {
                System.out.printf("%d x %d = %d\n", i, z, i * z);
            }
//            if (i < 9)
//            System.out.println("---------------");


        }
    }
}
