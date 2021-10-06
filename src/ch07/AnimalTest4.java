package ch07;

public class AnimalTest4 {
    public static void main(String[] args) {
        Animal ani = new Cat();
        Cat cat = (Cat) ani;
        BigCat bc = (BigCat) cat;//자식타입은 부모객체 주소값 저장 못함 (런타임 에러)
        bc.sleep();
    }
}
