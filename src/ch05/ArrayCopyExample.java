package ch05;

public class ArrayCopyExample {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30};//arr1 arr2 둘다 얘한테 접근 가능
        int[] arr2 = arr1; //얕은 복사(shallow copy)

        System.out.println("arr1[0] : " + arr1[0]);
        System.out.println("arr2[0] : " + arr2[0]);

        arr2[0] = 5;
        System.out.println("arr1[0] : " + arr1[0]);
        System.out.println("arr2[0] : " + arr2[0]);

        //레퍼런스변수간에 == 비교는 주소값 비교

        System.out.println(arr1 == arr2);

        System.out.println(arr1.hashCode());
        System.out.println(arr2.hashCode());
    }
}
