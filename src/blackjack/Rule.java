package blackjack;

import java.util.List;

public class Rule {
    public static int getSCore(List<Card> cards) {//멤버필드가 없기때문에 static 가능
        int sumPoint = 0;//선언,초기화
        for (int i = 0; i < cards.size(); i++) {
            Card c = cards.get(i);
            sumPoint += c.getPoint();
        }
        return sumPoint;
    }

    public static void getWinner(Dealer dealer, Gamer gamer) {
        int dealerScore = getSCore((dealer.openCards()));
        int gamerScore = getSCore((gamer.openCards()));
//        int dealerScore = 22;//TEST 용
//        int gamerScore = 21;

        System.out.println("dealerScore : " + dealerScore);
        System.out.println("gamerScore : " + gamerScore);

        //경우의 수 3(비긴경우(점수 같음, 둘다 21점 넘김), 딜러 승, 게이머 승)

//        if (dealerScore > gamerScore || gamerScore > 21) {
//            System.out.println("딜러 승");
//        } else if (gamerScore > dealerScore || dealerScore > 21) {
//            System.out.println("게이머 승");
//        } else  {
//            System.out.println("비김");
//        }

        //분기문이 강사님이랑 다른데 결과값은 맞음...
        final int STAND_SCORE = 21;
        if ((dealerScore == gamerScore) || (dealerScore > STAND_SCORE && gamerScore > STAND_SCORE)) {
            System.out.println("비겼다.");
        } else if ((dealerScore <= STAND_SCORE && gamerScore > STAND_SCORE ||
                (dealerScore <= STAND_SCORE && dealerScore > gamerScore))) {
            System.out.println("딜러 승");
        } else {
            System.out.println("게이머 승");
        }
    }
}
