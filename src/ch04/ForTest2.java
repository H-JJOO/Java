package ch04;

public class ForTest2 {
    public static void main (String[] args) {
        int star = (int)(Math.random() * 9) + 2; // 2 ~ 10

        System.out.println("star : " + star);
        for (int i =0; i < star ; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i =50; i < star + 50 ; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = star; i >0 ; i--) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = star + 34; i > 34 ; i--) {
            System.out.print("*");
        }
    }
}
