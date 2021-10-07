package blackjack;

//import java.util.*
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CardDeck {
    private List<Card> cards;//어떤값을 입력하는 통에 주소값 연결


    //메소드, 생성자 다른 점 2가지(생성자 조건)(기본생성자는 파라미터 없는경우)
    //1. 클래스명이랑 이름이 같다.
    //2. 리턴타입이 없다.
    public CardDeck() {//기본 생성자
        init();

    }

    //5번문제 일듯? 변수는 다를거고
    private void init() {//내부에서만 쓰드록 private
        String[] patters = new String[]{"♠", "♥", "♣", "◆"};//4칸 배열
        cards = new LinkedList();//배열생성

        for (int i = 0; i < patters.length; i++) {//4번반복
            for (int z = 1; z <= 13; z++) {//1 부터 13번 반복 4x13=52번 반복
                String denomination = null;//초기화
                switch (z) {
                    case 1:
                        denomination = "A"; break;
                    case 11:
                        denomination = "J"; break;
                    case 12:
                        denomination = "Q"; break;
                    case 13:
                        denomination = "K"; break;
                    default:
                        denomination = String.valueOf(z);//2~10은 정수를 문자열로 변경
//                        denomination = z + "";
                }
                Card c = new Card(patters[i], denomination);//객체화
                cards.add(c);

//                cards.add(new Card(patters[i], denomination));
            }//for
        }//for


    }

    //항상 랜덤한 카드를 준다.
    //이거까지하면 카드덱 완성
    public Card getCard() {
        //if 콜렉션을 배열로 했다면 먼저 섞고, 순차적으로 카드를 줬을꺼다.
        //if 콜렉션을 ArrayList로 했다면 랜덤하게 카드를 준다.

        int rIdx = (int)(Math.random()*cards.size());
        Card c = cards.remove(rIdx);//지운걸
        return c;//리턴해준다.

//        return cards.remove((int)(Math.random() + cards.size())); // 가독성 나빠서 잘 안씀
    }


    //카드가 잘 만들어 졌는지 확인하는 메소드
    public void showAllCards() {
//
//        for (int i = 0; i < cards.size(); i++) {//cards.size() 가 현재 0 이라 for문이 돌지 않음(cards 에 값 주기 전) 52번
//            Card c = cards.get(i);
//            System.out.println(c);
//        }

        //ForEach(출력만 할때 훨씬 편함, 수정은 안됨, index가 있으면 쓸수 있음, 넣는 순서가 중요한)

        for (Card c : cards) {//타입 변수명 : 배열(cards)
            System.out.println(c);
        }

    }




}
