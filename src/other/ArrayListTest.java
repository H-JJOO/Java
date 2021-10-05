package other;

//import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();//레퍼런스 변수인데 타입이 다르면 객체화 할수 있는것은 상속경우 밖에 없다.

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(100);

        int removeVal = list.remove(0);
        System.out.println("removeVal : " + removeVal);
        for (int i = 0; i < list.size(); i ++) {
            System.out.printf("(%d) - %d\n" , i, list.get(i));//객체안에서 빼낼때 get 사용
        }




//        System.out.println(list);
//
//        MyArrayList myList = new MyArrayList();
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
//        myList.add(100);
//        myList.print();


    }
}
