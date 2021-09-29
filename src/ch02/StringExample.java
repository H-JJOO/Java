package ch02;

public class StringExample {
    public static void main (String[] args) {
        String str1 = "안녕하세요";//String 은 레퍼런스(참조) 변수, str1은 주소값

        System.out.println(str1);
        System.out.println(str1 + " 그래요~" + str1);

        str1 = str1 + 13;//문자열 + 문자열
        System.out.println(str1);

        String str2 = 10 + 10 + "10";
        System.out.println(str2);

    }
}

//객체지향
//경계선이 있는 것들(모니터, 사람)
//객체는 속성(명사)과 메서드(동사) 만을 가질수 있다.