package ch07;

public class TelevisionTest {
    public static void main(String[] args) {
        Television tv = new Television();
        tv.turnOn();
        tv.volumeState();
        for (int i = 0; i<3; i++) {
            tv.volumeUp();
        }
//        for (int i = 0; i < 200; i++) {
//            tv.volumeDown();
//        }
        tv.volumeState();
        tv.turnOff();

    }
}
