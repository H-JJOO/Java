package blackjack;

public class CardTest2 {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();//CardDeck 객체 생성
        Gamer gamer = new Gamer();

        for (int i = 0; i < 3; i++) {//카드 3번 뽑기
            Card c = cd.getCard();//랜덤하게 뽑기
            System.out.println(c);//뽑은거 출력

            gamer.receivedCard(c);//게이머에게 카드 주기
        }
        System.out.println("-----------------------");
//        cd.showAllCards();//전체카드에서 뽑은카드 제거하고 출력

        gamer.showAllMyCards();
    }
}
