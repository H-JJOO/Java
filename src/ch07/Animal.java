package ch07;

public abstract class Animal {//객체화 못하게 막음
    public void crying() {
        System.out.println("동물이 울다.");
    }

    public abstract void eat();//선언부만 만들어야함, 구현부 만들면 안됨. 추상메소드가 하나라도 있으면 클래스는 추상 클래스가 되어야한다.

    /*
    class 키워드 왼쪽에 abstract 를 붙이면 추상 클래스가 된다.
    추상 클래스가 되면 객체화 불가능.

    추상 메소드가 클래스에 1개라도 존재하면 그 클래스는 추상 클래스가 되어야 한다.(abstract 키워드 꼭 붙여야 함)

    추상 메소드는 강제성이 있다. 자식은 추상 메소드를 꼭 구현(오버라이딩)해야 한다.

    여러 개발자가 같이 개발할때 강제성을 주기위한 방법이다.
     */

}
