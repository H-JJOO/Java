package ch06;

public class PrivateClassTest {
    public static void main(String[] args) {
        PrivateClass pc = new PrivateClass();//class 가 public 이라 보임, 객체화 가능
//        pc.val = 10; //private 접근 불가능
        pc.defaultVal = 10;
    }
}
