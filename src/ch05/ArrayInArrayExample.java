package ch05;

public class ArrayInArrayExample {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];

        System.out.println(arr.length);
        System.out.println(arr[0].length);
        System.out.println(arr[1].length);

        for (int i = 0; i < arr.length; i++) {

            for (int z = 0; z < arr[i].length ; z++) {
                System.out.printf("(%d, %d) : %d\t", i, z, arr[i][z]);
            }
            System.out.println();
        }
    }
}
