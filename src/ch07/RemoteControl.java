package ch07;

public interface RemoteControl {//객체화 안됨. 부모역할만 할거임
     public static final int MAX_VOLUME = 10;//public static final 자동
    int MIN_VOLUME = 0;

    public abstract void turnOn();//public abstract 자동
    public void turnOff();
    abstract void volumeUp();
    void volumeDown();//어차피 자동으로 들어가서 보통 이렇게 적음
}
