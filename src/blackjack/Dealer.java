package blackjack;

public class Dealer extends Gamer {
    //Gamer 를 상속받았기 때문에 Gamer 모든 기능을 가져온다
    //2장의 카드 합계 점수가 16점 이하이면 반드시 1장을 추가로 뽑고, 17점 이상이면 받을 수 없다.
    public void moreCard(CardDeck cd) {
        //본인의 카드가 2장인지 확인
        //2장의 카드의 점수가 16점 이하인지 확인
        //16점 이하면 한장 더 뽑기

        //List<Card> localMyCards = openCards();//Gamer 클래스의 myCards 를 private 에서 protected 로 바꾸는것 아니면 openCards() 를 이용해서 주소값을 받아와서 진행, 일단 protected 로 진행함
        if (myCards.size() == 2) {
            int sumPoint = 0;//선언,초기화
            for (int i = 0; i < 2; i++) {
                Card c = myCards.get(i);
                sumPoint += c.getPoint();
            }

            if (sumPoint <= 16) {
                Card c = cd.getCard();
                receivedCard(c);
//                receivedCard(cd.getCard());//한줄로
            }


        }
    }
}
