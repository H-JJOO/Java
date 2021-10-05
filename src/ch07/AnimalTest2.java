package ch07;

public class AnimalTest2 {
    public static void main(String[] args) {
        BigCat bc = new BigCat();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();

        AnimalTest2 animalTest2 = new AnimalTest2();


        animalTest2.animalCrying(bc);//객체화안한 static 메서드, 큰 고양이 냐~~~옹
        animalTest2.animalCrying(cat);//고양이 야옹야옹
        animalTest2.animalCrying(dog);//강아지가 멍멍
        animalTest2.animalCrying(cow);//소가 음머~~~


    }
// 다형성 없이 오버로딩으로만 해결
//    public static void animalCry(BigCat bc) {bc.crying();}
//    public static void animalCry(Cat cat) {cat.crying();}
//    public static void animalCry(Dog dog) {dog.crying();}
//    public static void animalCry(Cow cow) {cow.crying();}

    // 다형성으로 해결
    public  void animalCrying(Animal animal) {
        animal.crying();
    }



}
