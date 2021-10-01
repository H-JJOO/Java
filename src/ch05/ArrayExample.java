package ch05;

public class ArrayExample {
    public static void main(String[] args) {
        //배열(Array)

        /*
        같은 타입의 값을 여러개 저장할 때 좋다.
        for문과 함께 사용하면 좋다.
        */

        //index 방 번호 부여 0,1,2(83,90,87), scores 에는 index 주소값이 복사됨

        //정수형
        int[] scores = {83, 90, 87, 100, 50};//배열만들고 초기화, ☆int형 배열☆
//        scores 는 (레퍼런스타입)참조변수, 원시아님

//        scores[5] = 11;//index 오버하면 에러뜸

//        System.out.println(scores[0]);

//        System.out.println(scores.length);//배열의 길이

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
    }
}
