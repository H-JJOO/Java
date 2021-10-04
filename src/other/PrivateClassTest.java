package other;

import ch06.PrivateClass;//import 해야 다른 패키지 클래스를 쓸수있음

public class PrivateClassTest {
    public static void main(String[] args) {
        PrivateClass pc = new PrivateClass();
//        pc.val = 10;
//        pc.defaultVal = 10; //default 패키지가 달라져서 접근 불가능
    }
}
