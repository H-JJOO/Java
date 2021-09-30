package ch04;

public class CheckQuiz4 {
    public static void main(String[] args) {
        int star = 5;
        for (int i =1; i<=star; i++) {
            for (int z = 0; z<i; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
