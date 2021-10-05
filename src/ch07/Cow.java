package ch07;

public class Cow extends Animal{
    public void crying() {
        System.out.println("소가 음머~~~");
    }

    @Override
    public void eat() {
        System.out.println("소가 어그적 어그적 먹는다");
    }
}
