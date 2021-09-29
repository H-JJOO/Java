package ch04;

public class IfTest3 {
    public static void main (String[] args) {
        // 60~100
        int score = (int)(Math.random() * 41) + 60;
        char grade = 'D';//70점미만일 경우 디폴트 값
        char pm = ' ';

        //grade 만 결정
        if (score >= 90) { grade = 'A'; }
        else if (score >= 80) { grade = 'B'; }
        else if (score >= 70) { grade = 'C'; }

        //+- 결정
        if (score >= 70) {
            int mVal = score % 10;//98을 10으로 나눈 나머지 8을 mVal 에 넣어
            if (mVal >= 8 || score == 100) { pm = '+'; }
            else if (mVal <= 3) { pm = '-'; }
        }
        System.out.printf("%d : %c%c", score,grade, pm);

    }
}
