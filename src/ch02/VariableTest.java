package ch02;

public class VariableTest {
    public static void main(String[] args) {
        //1. 정수는 실수값을 저장할 수 없다.
        //2. 작은타입에서 큰타입으로는 자동형변환이 이뤄진다. (물론 수동도 된다.)
        //3. 큰타입에서 작은타입으로는 자동형변환이 안 된다. (무조건 수동으로 해야 된다.)
        int n1 = 10;
        int n2 = 3;
        //double result = n1 /  n2;
        double result = (double) n1 / n2;
        System.out.println("결과 : " + result);

    }
}
