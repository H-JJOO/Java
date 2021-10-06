package blackjack;

import java.util.Scanner;

public class Game {
    public void play() {
        Scanner scan = new Scanner(System.in);
        CardDeck cd = new CardDeck();
        Dealer dealer = new Dealer();
        Gamer gamer = new Gamer();
        Rule rule = new Rule();

        for (int i = 0; i<2; i++) {//순차적으로 각자 2장의 카드를 갖도록 한다.
            dealer.receivedCard(cd.getCard());
            gamer.receivedCard(cd.getCard());
        }
        dealer.moreCard(cd);

        while (true) {
            System.out.println("-- 나의 카드 리스트 --");
            gamer.showAllMyCards();
            System.out.println("카드를 더 뽑으시겠습니까? (y/n");
            String yn = scan.next();//외부에서 입력
            if ("n".equals(yn)) { break; }
            gamer.receivedCard(cd.getCard());
        }
        System.out.println("-- 딜러 카드 리스트 --");
        dealer.showAllMyCards();
        rule.getWinner(dealer, gamer);
    }
}
