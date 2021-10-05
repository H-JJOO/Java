package ch06;
/*
    2가지로 구성
    - 멤버필드 (변수, 상수)
    - 메소드(생성자)
 */
public class Car {//설계도 를 실체화하는게 객체화
    //멤버필드(나이,국적,키 등등 정적인것(명사))
    String nm;
    String brand;//전역변수

    //생성자(객채화할때 생성할때 한번밖에 못씀, 메소드는 주소값만 알면 언제든지 호출 할수 있다.)
    //1. 클래스명과 같다.(대문자로 시작)
    //2. 리턴 타입이 없어야 한다.(void, String 등등 없어야함)
    //* 생성자가 하나도 없으면 컴파일러가 자동으로 기본생성자(파라미터 없는)를 넣어준다.

    //오버로딩 : 똑같은 이름의 메소드를 여러개 만들 수 있는 기술
    //         파라미터만 다르다면 다르게 만들 수 있다.
    //         타입만 중요, 타입의 갯수, 순서 (리턴타입은 상관없음)
    Car() {}

    Car(int aaa, String bbb) {

    }
    Car(String aaa, int bbb) {

    }

    Car(String brand, String nm) {//지역변수(메소드안에서 생성된 변수,메소드를 벗어나면 객체 소멸), 전역변수(class 에 생성된 변수,객체 소멸전까지 죽지않음)
        this.brand = brand;//this : this 라는 상수에 객체 나 자신의 주소값을 넣는다., 맴버필드에 값 넣고싶다 싶으면 무조건 this 쓰면 될거다.
        this.nm = nm;
    }

    //메소드(달린다, 멈춘다(동사))
    void drive() {
        System.out.printf("%s의 %s가 달린다.\n",  brand, nm);
    }

    void stop() {
        System.out.printf("%s의 %s가 멈춘다.\n", brand ,nm);
    }
}
