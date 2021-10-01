package ch05;

public class ArrayTest {
    public static void main(String[] args) {
        int[] scores = {100, 87, 56, 23, 28, 98, 30, 32, 17, 22};

        //점수가 짝수인 친구들만 점수 프린트 해주시고
        //점수가 홀수인 친구들의 합계점수도 프린트 해주세요.

        int oddsum = 0;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] % 2 == 0) {//짝수
                System.out.printf("scores[%d] : %d\n", i, scores[i]);
            } else {//홀수
                oddsum += scores[i];
            }
        }
        System.out.println("홀수 합계 : " + oddsum);
    }
}
