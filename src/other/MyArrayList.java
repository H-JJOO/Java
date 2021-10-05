package other;

public class MyArrayList {
    private int[] arr = new int[0];//멤버필드에 디폴트값 넣는 방법 1 명시할당 (이거 쓰셈)

//    public MyArrayList() {//멤버필드에 디폴트값 넣는 방법 2 (잘안씀)
//        arr = new int[0];

    public void add(int val) {//10//20//30
        int[] temp = new int[arr.length + 1];//0//1//2
        for (int i = 0; i<arr.length; i++) {//0//1//2
            temp[i] = arr[i];
        }
        temp[arr.length] = val;//[0]10//[1]20//[2]30

        arr = temp;//10//20//30
    }

    public int size() {
        return arr.length;
    }

    public void  print() {
        System.out.print("[");
        for (int i = 0; i <arr.length; i++) {
            if ( i != 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.println("]");
    }

}
