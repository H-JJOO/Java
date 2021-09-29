package ch04;

public class RandomExample {
    public static void main(String[] args) {
        int num = (int)(Math.random() * 6);

        //0.0 ~ 0.999999999999999999999999
        //5.412312412
        //0~5
        System.out.println("num : " + num);

        // 2~7
        int num2 = (int)(Math.random() *6) + 2;
        System.out.println("num2 : " + num2);

        // 55~108
        int num3 = (int)(Math.random() * 54) + 55;
        System.out.println("num3 : " + num3);

        // 41~127
        int num4 = (int)(Math.random() * 86) + 41;
        System.out.println("num4 : " + num4);
    }
}
