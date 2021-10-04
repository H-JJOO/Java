package ch05;

public class PrimitiveAndRefExample3 {//class 앞에 public 붙일수있는건 파일명과 같은 class 만 가능
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.val = 3;

        Box box2 = new Box();
        box2.val = 5;

        System.out.println(box1.val);
        System.out.println(box2.val);
        PrimitiveAndRefExample.changeVal(box1);
        PrimitiveAndRefExample.changeVal(box2);
        System.out.println(box1.val);
        System.out.println(box2.val);
    }

    public static void changeVal(String str) {
        str = "안녕";
    }

}


