package blackjack;
//4번문제
public class Card {
    //문자열로 저장
    private String pattern;//무늬(shape)
    private String denomination;//숫자, 값(value)

    //한번만 값 입력되도록 생성자 사용할거임
    public Card(String pattern, String denomination) {
        //super();
        this.pattern = pattern;
        this.denomination = denomination;
    }

    //static 사용조건(파라미터 값만을 사용할 때)
//    public static int sum(int a, int b) {
//        return a + b;
//    }

    //getter 메소드 만들기
    public String getPattern() {
        return this.pattern;
    }
    //getter 메소드 만들기
    public String getDenomination() {
        return this.denomination;
    }

    public int getPoint() {
        //denomination 값이 "A" > 1
        //denomination 값이 "2" > 2
        //denomination 값이 "3" > 1
        //...
        //denomination 값이 "10" > 10
        //denomination 값이 "J", "Q", "K"  > 10
        switch (denomination) {
            case "A":
                return 1;
            case "J": case "Q": case "K":
                return 10;
            default://"2"~"10" > 문자열을 정수형으로 parsing (파싱)
                return Integer.parseInt(denomination);
            }
        }


    @Override
    public String toString() {
//        String str = String.valueOf(1);//문자그대로 바꿔줌
//        String str2 = String.format("%s - %s", this.pattern, this.denomination);//사용하고싶은 구조로 사용할 수 있음


        return String.format("%s - %s", this.pattern, this.denomination);
    }
}
