package blackjack;

import java.util.LinkedList;
import java.util.List;

public class Gamer {
    //배열 X(고정값이 있으면 에러 발생 확률 있음)
    //LinkedList 사용
    protected List<Card> myCards;//상속이면 다른프로젝트에서도 사용 가능

    public Gamer() {
        init();
    }

    private void init() {
        myCards = new LinkedList();
    }

    //카드받기
    public void receivedCard(Card c) {
        myCards.add(c);
    }

    //카드오픈
    public List<Card> openCards() {
        return myCards;
    }

    //나의(게이머) 카드가 잘 만들어 졌는지 확인하는 메소드
    public void showAllMyCards() {
        for (Card c : myCards) {
            System.out.println(c);
        }
    }
}
