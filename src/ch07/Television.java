package ch07;

public class Television implements RemoteControl{
    private int volume=6;


    @Override
    public void turnOn() {
        System.out.println("티비야 켜져라");
    }

    @Override
    public void turnOff() {
        System.out.println("티비야 꺼져라");
    }

    @Override
    public void volumeUp() {
        if (volume < MAX_VOLUME) {
            volume++;
        }
    }

    @Override
    public void volumeDown() {
        if (volume > MIN_VOLUME) {
            volume--;
        }
    }

    public void volumeState() {
        System.out.println("volume : " + volume);
    }

}
