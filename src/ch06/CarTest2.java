package ch06;

public class CarTest2 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "BMW";
        car1.nm = "320";

        Car car2 = car1;//얕은복사

        car1.drive();
        car1.stop();
        car2.drive();
        car2.stop();

        System.out.println(car1 == car2);//주소값이 같은 얕은 복사

        System.out.println("car1의 브랜드 : " + car1.brand );//car1주소값에 있는 값을 읽는다.
        System.out.println("car2의 브랜드 : " + car2.brand );//주소값이 같으니까 값도 같다.

    }
}

