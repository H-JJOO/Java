package ch07;

public class Cat extends Animal{
    @Override
    public void crying() {
        System.out.println("고양이가 야옹야옹");
    }

    @Override
    public void eat() {//부모클래스인 Cat 에서 abstract 해주면 자식클래스인 BigCat 에서는 abstract 해줄 필요 없지만, 부모클래스에서 안해주면 자식클래스에서 해줘야한다.
        System.out.println("고양이가 낼름낼름 먹는다.");
    }


}
