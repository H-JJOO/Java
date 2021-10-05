package ch07;

public class AnimalTest {
    /*
    다형성 (여러가지 형태가 있는 성질), 멤버필드 2개가 상충되서 굉장히 어려움(딱히 쓸일도...)

    1. 부모타입은 자식객체 주소값 저장할 수 있다. (가리킬 수 있다, 참조 할수 있다.)

    2. 자식타입은 부모객체 주소값 저장할 수 없다. (가리킬 수 없다, 참조 할수 없다.) 바로 컴파일에러 발생.

    3. 메소드 호출은 타입이 알고 있는 것만 호출 할 수 있고, 내용은 객체 기준이다.


     */
    public static void main(String[] args) {
        BigCat bigCat = new BigCat();

        //1. 부모타입은 자식객체 주소값 저장 할 수 있다.
        Cat cat = new BigCat();//자동형변환
        Animal animal = new BigCat();
        Animal animal2 = new Cat();
//        Animal animal3 = new Animal();
//        Object obj = new Animal();

        //2. 자식타입은 부모객체 주소값 저장 할 수 없다.
//        BigCat bc = (BigCat)new Cat();
//        Cat cat2 = new Animal();

        //3. 메소드 호출은 타입이 알고 있는 것만 호출 할 수 있고, 내용은 객체 기준이다. 타입은 메소드를 호출할수 있냐 없냐 여부만 확인하고, 내용은 호출되는 객체 기준이다. 해당 메소드가 없으면 부모로 올라가서 찾는다.
        Cat cat2 = new BigCat();//호출한 객체인 BigCat() 이 실행
        cat2.crying();
//        cat2.sleep();
        BigCat bigCat1 = (BigCat)cat2 ;//수동형변환(강제형변환)
        bigCat.sleep();
    }
}
