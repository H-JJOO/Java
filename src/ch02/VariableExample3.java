package ch02;

public class VariableExample3 {
    public static void main(String[] args) {
        char c = 'B';
        System.out.printf("%c : %d\n", c, (int)c);

        int i = 69;
        System.out.printf("%c : %d\n",(char)i, i);

        boolean bl = false;
        System.out.println(bl);



    }
}

//boolean 숫자타입 아님
//byte < char < short < int < long < float < double < String
//원시타입 우선순위
//정수타입 int
//실수타입 float, double (잘 모르겠으면 double)
//대문자시작이면 레퍼런스 변수