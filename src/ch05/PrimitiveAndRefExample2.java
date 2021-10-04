package ch05;

public class PrimitiveAndRefExample2 {//class 앞에 public 붙일수있는건 파일명과 같은 class 만 가능
    public static void main(String[] args) {
        String s1 = "Hello";
        System.out.println(s1);
        changeVal(s1);
        System.out.println(s1);
    }

    public static void changeVal(String str) {
        str = "안녕";
    }

}


