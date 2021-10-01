package ch05;

public class MethodExample2 {
    public static void main(String[] args) {
        // input O, output O (비 void형)
        int result = sum(10,20);
        System.out.println("sum : " + result);
    }
        //메소드는 최소단위로 만들어야함
    public static int sum(int n1, int n2) {//매개변수 항상 값이 변할 수 있음
        return n1 + n2;

        //비 void 라면 값이 안넘어 올수가 없다.

    }

}
