package ch07;
//상속(중복된 소스를 줄이기위해 사용)
//부모 클래스
public class CellPhone {
    String model;
    String color;

    public CellPhone() {
        this("노트10", "white");
    }

    public CellPhone(String model, String color) {
        this.model = model;
        this.color = color;
    }

    void powerOn() {
        System.out.println("전원을 켭니다.");
    }

    void powerOff() {
        System.out.println("전원을 끕니다.");
    }

    void printInfo() {
        System.out.printf("model : %s, color : %s", model, color);
    }

    void sendMsg(String msg) {
        System.out.println("보낸 메세지 : " + msg);
    }
}
