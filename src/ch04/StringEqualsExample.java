package ch04;

public class StringEqualsExample {
    public static void main(String[] args) {
        //문자열값 비교!, 절대 == 비교하면 안된다.!!!!!!!!!

        //new 는 객체를 만들어라 라고 이해하면 됨.
        //변수는 은닉화, 캡슐화 되어있다.
        //아파트 설계도 동작하는건 적어놓음.(구조)
        //new 가 아파트를 짙는역할
        //같은 설계도라도 str1, str2 주소값은 다르다
        //구조는 똑같지만 주소는 절대로 같을수 없다. (메모리에 저장공간 다르다)
        String str1 = new String("안녕하세요");
        //str1 은 String 객체 주소값만 저장할수 있는 통이다.
        String str2 = new String("안녕하세요");

        System.out.println(str1 == str2);//false

        String str3 = str2;//다른 통이지만 같은 값을 담고 있음.
        System.out.println(str3 == str2);//그래서 true

        //아파트가 같은 아파트인지(주소말고)
        System.out.println("str1.equals(str2) : " + str1.equals(str2));
        System.out.println("str2.equals(str1) : " + str2.equals(str1));
        System.out.println("str3.equals(str1) : " + str3.equals(str1));

        // if 문으로 비교할때는 무조건 equals 사용해야함
        // switch 에서는 == 가능
    }
}
