package other;

public class NumberBoxTest {
    public static void main(String[] args) {
        NumberBox nb1 = new NumberBox(1);
        NumberBox nb2 = new NumberBox(2);

        System.out.println(nb1 == nb2);
        System.out.println(nb1.equals(nb2));//원래는 주소값 비교, String 만 값 비교 (오버로딩, 재정의 되어 있기때문에)
        System.out.println(nb1.getVal());
        System.out.println(nb2.getVal());

        System.out.println("nb1 : " + nb1);
        System.out.println(nb1.toString());
        System.out.println("nb2 : " + nb2);
        System.out.println(nb2.toString());

        String str = new String("abc");
        System.out.println(str);//println 특징 : 전부다 String 으로 바꾸려고함

        System.out.println(str.toString());
    }
}
