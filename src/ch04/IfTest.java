package ch04;

public class IfTest {
    public static void main (String[] args) {
        int score = 69;

        //점수가 90점이상이면 A등급
        //점수가 80점이상이면 B등급
        //점수가 70점이상이면 C등급
        //점수가 70점미만이면 D등급

        //C등급
        //?7점 이상이면 +
        //?3점 이하이면 -

        //예) 98점이면 A+
        //예) 85점이면 B
        //예) 73점이면 C-

        if (score > 90) {
            if (score >= 98) {
                System.out.println("A+");
            } else if (score >= 94) {
                System.out.println("A");
            } else {
                System.out.println("A-");
            }
        } else if (score > 80) {
            if (score >= 88) {
                System.out.println("B+");
            } else if (score >= 84) {
                System.out.println("B");
            } else {
                System.out.println("B-");
            }
        } else if (score > 70) {
            if (score >= 78) {
                System.out.println("C+");
            } else if (score >= 74) {
                System.out.println("C");
            } else {
                System.out.println("C-");
            }
        } else {
            System.out.println("D");
        }


    }
}
