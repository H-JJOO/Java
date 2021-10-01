package ch05;

public class MethodTest {
    public static void main(String[] args) {
        //void 형 input O output X (void 형)
        //printMyself("황장군", 17, 180.82f, 'A');
        //황장군의 키는 180.8cm, 나이는17세, 혈액형은 A형이다.
        printMyself("황장군", 180.82f, 17, 'A');

        int mon = (int)(Math.random() * 12) + 1; //1~12

        System.out.println();

        System.out.println("mon : " + mon);
        printSeason(mon);
        //12, 1, 2 > "겨울"
        //3, 4, 5 > "봄"
        //6, 7, 8 > "여름"
        //9, 10, 11> "가을"
        //1~12 사이값이 아닌 값이 들어오면 "알 수 없음"

    }

    public static void printMyself(String nm, float height, int age, char bloodType) {
        System.out.printf("%s의 키는 %.2fcm, 나이는 %d세, 혈액형은 %c형이다.", nm, height, age, bloodType);
    }

    public static void printSeason(int mon) {

//        if (mon == 12 || mon == 1 || mon ==2){
//            System.out.println("겨울");
//        } else if (mon == 3 || mon == 4 || mon ==5) {
//            System.out.println("봄");
//        } else if (mon == 6 || mon == 7 || mon ==8) {
//            System.out.println("여름");
//        } else if (mon == 9 || mon == 10 || mon ==11) {
//            System.out.println("가을");
//        } else {
//            System.out.println("알 수 없음");
//        }

        if (mon < 1 || mon > 12) {
            System.out.println("알 수 없음");
        } else if (mon == 12 || mon < 3) {
            System.out.println("겨울");
        } else if (mon < 6) {
            System.out.println("봄");
        } else if (mon < 9) {
            System.out.println("여름");
        } else {
            System.out.println("가을");
        }
    }
}
