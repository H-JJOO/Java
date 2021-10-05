package ch07;

public class Dog extends Animal{
    public void crying() {
        System.out.println("강아지가 멍멍");
    }

    @Override
    public void eat() {
        System.out.println("강아지가 왁자지껄 먹는다.");
    }
}
