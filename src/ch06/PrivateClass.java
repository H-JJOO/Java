package ch06;

public class PrivateClass {
    private int val;//class 앞에 못준다.
    int defaultVal;

    public PrivateClass() {}//private 하면 객체 생성을 다른 클래스, 다른 프로젝트에서 맊음

    private void print() {
        System.out.println("프린트!!!");
    }
}
