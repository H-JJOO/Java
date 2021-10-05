package ch06;

public class CarTest {
    public static void main(String[] args) {
        String car2 = new String("");
        Car car = new Car();//레퍼런스변수, "나는 주소값을 저장하는 변수야, 나는 Car 의 객체주소값만 저장할수 있어, 다른 객체는 저장할수 없어", new 는 객체화하는 키워드
        //. (주소값.) 그 객체에 접근한다.
        car.brand = "현대";
        car.nm = "소나타";
        car.drive();
        car.stop();
        System.out.println(car.brand);

        Car car3 = new Car();//기존의 현대 소나타는 없어지지않고 유지되어있음
        car3.brand = "기아";
        car3.nm = "K5";
        car3.drive();
        car3.stop();

        //깊은복사
        Car car4 = new Car();//레퍼런스변수, "나는 주소값을 저장하는 변수야, 나는 Car 의 객체주소값만 저장할수 있어, 다른 객체는 저장할수 없어", new 는 객체화하는 키워드
        //. (주소값.) 그 객체에 접근한다.
        car4.brand = "현대";
        car4.nm = "소나타";
        car4.drive();
        car4.stop();

        System.out.println(car == car3);
        System.out.println(car == car4);

        System.out.println();
    }

}
