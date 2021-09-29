package ch04;

public class IfExample {
    public static void main(String[] args) {
        int score = 89;

        if(score >= 90) {
            System.out.println("점수가 90점보다 큽니다.");
            System.out.println("등급은 A 입니다.");
        }

        if (score < 90) {
            System.out.println("점수가 90점보다 작습니다.");
            System.out.println("등급은 B 입니다.");
        }
    }
}
