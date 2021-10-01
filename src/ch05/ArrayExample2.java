package ch05;

public class ArrayExample2 {
    public static void main(String[] args) {
        int[] arr = new int[5];//방만 만든상태, 각방에는 디폴트값(0) 드감
        // 레퍼런스타입의 배열에는 0이아닌 null 이 디폴트값임

        //{100, 200, 300, 400, 500}

        for (int i = 0; i < arr.length; i++ ) {
            arr[i] = (i + 1) * 100;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
