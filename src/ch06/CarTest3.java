package ch06;

public class CarTest3 {
    public static void main(String[] args) {
        Car car = new Car();//기본생성자 호출
        car.brand = "현대";
        car.nm = "소나타";

        Car car2 = new Car("현대","그랜저");
        System.out.println("car2.brand : " + car2.brand);
        System.out.println("car2.nm : " + car2.nm);

        car2 = car;
        System.out.println("car2.nm : " + car2.nm);

        Car car3 = new Car("1",1);


    }
}
