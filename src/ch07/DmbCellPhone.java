package ch07;

public class DmbCellPhone extends CellPhone{
    int channel;

//    public DmbCellPhone() {}
//
//    public DmbCellPhone(int channel) {
//        this.channel = channel;
//    }

    public DmbCellPhone(String model, String color, int channel) {
//        super();//CellPhone, 부모 기본 생성자 호출, 현재는 생략해도 됨,  > 이 경우가 아닌경우 > 부모가 기본생성자가 없을 때! (파라미터 넣어줘야함)
        super("","");
        this.model = model;
        this.color = color;
        this.channel =channel;

        /*
        은닉화된 멤버필드에 값을 넣을 수 있는 방법(2)

        1 .setter 메소드 이용해서 객체에 값 넣기

        2. 생성자를 이용해서 객체에 값 넣기

        은닉화된 멤버필드에서 값을 빼내는 방법(1)

        1. getter 메소드 이용해서 객체에 값 넣기

        ☆★은닉화된 멤버필드에 값을 넣고 뺄때는 getter setter 메소드를 이용해야하고 추가로 값을 넣을수 있는 방법으로는 생성자를 이용해서 객체에 값 넣는것이 있다.☆★

         */


    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.printf("model : %s, color : %s, channel : %d\n", model, color, channel);

    }
}
