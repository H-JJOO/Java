package ch07;

public class TelevisionTest {
    public static void main(String[] args) {
        Television tv = new Television();
        RemoteControl rc= tv;
//        Television tv2 = rc;//자식객체가 부모객체를 가리킬수없다.
        Television tv2 = (Television) rc;//수동형변환 해야함
//        rc.volumeState();//호출할 수 없다.
        //실제로 어떤타입으로 호출했던 호출만 된다면 값을 같음.
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
