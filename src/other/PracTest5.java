package other;

import blackjack.Card;

import java.util.ArrayList;
import java.util.List;

public class PracTest5 {
    private List<Card> cards;

    //기본 생성자
    public PracTest5() {
        init();
    }

    private void init() {
        String[] shapes = new String[]{"스페이드","하트","클럽","다이야"};
        cards = new ArrayList();

        for (int i = 0; i < shapes.length; i++) {
            for (int z = 1; z <= 13; z++) {
                String value = null;
                switch (z) {
                    case 1:
                        value = "A"; break;
                    case 11:
                        value = "J"; break;
                    case 12:
                        value = "Q"; break;
                    case 13:
                        value = "K"; break;
                    default:
                        value = String.valueOf(z);
                }
                Card c = new Card(shapes[i], value);
                cards.add(c);
            }
        }
    }
}
