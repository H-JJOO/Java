package blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardTest {
    public static void main(String[] args) {
        //스페이드, A
        //객체값 마다 다른 값 주기 위해서 static 쓰지 않은거임
        //setter 가 없다는것은 한번 입력된 값을 영원히 바꾸지 않고자 해서이다.
        Card c1 = new Card("♠", "A");
        Card c2 = new Card("♠", "2");
        Card c3 = new Card("♠", "3");

        //배열

        //ArrayList(이걸로할거임, 내부는 배열인데 다이내믹함)
        //add, remove, size, get 이정도 메소드는 쓸줄 알아야함

        List<Card> cards = new ArrayList();
        //제네릭 <> 안에 들어갈수 있는 타입을 넣어준다.
        //Card 타입을 가리킬수있는 주소값 현재는 c1 가능
        cards.add(c1);//들어갈때 카드 타입
        cards.add(new Card("♠", "2"));

        Card ccc = cards.get(0);//나올때도 카드 타입

        System.out.println(c1.getPattern());
        System.out.println(c1.getDenomination());

        System.out.println(c1);//♠ - A
        System.out.println(c2);//♠ - 2

        CardDeck cd = new CardDeck();//기본생성자 호출
        System.out.println("---------------------");
        cd.showAllCards();

//        int[] arr = new int[1];//new int[0] 이면 에러
//        arr[0] = 10;
//        System.out.println(arr[0]);

        //52장의 카드가 "♠" - A~K
        //"♥" ,"♣","◆"
    }
}
