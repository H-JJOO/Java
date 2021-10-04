package ch05;

public class PrimitiveAndRefExample {//class 앞에 public 붙일수있는건 파일명과 같은 class 만 가능
    public static void main(String[] args) {
        int val = 10;

        Box box = new Box();//레퍼런스타입 box(주소값)
        box.val = 10;



        System.out.println("val : " + val);
        changeVal(val);//타입이 같은 changeVal(int pVal) 이 온다 val 과 pVal 은 다른변수다
        System.out.println("val : " + val);
        System.out.println("---------");
        System.out.println("box.val : " + box.val);
        changeVal(box);
        System.out.println("box.val : " + box.val);
    }

    public static void changeVal(int pVal) {
        pVal = 30;
    }

    public static void changeVal(Box pBox) {
        pBox.val = 30;
    }

}


class Box {
    int val;//10
}

