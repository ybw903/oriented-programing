import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    private static final String[] PATTERNS = {"spade", "heart", "diamond", "club"};
    private static final int CARD_COUNT = 13;
    private List<Card> cards;

    public CardDeck() {
        this.cards = generateCards();
    }

    public List<Card> generateCards() {
        List<Card> cards = new ArrayList<>();
        for(String pattern : PATTERNS) {
            for (int i = 1; i <= CARD_COUNT; i++) {
                String denomination = numberToDenomination(i);
                Card card = new Card(pattern, denomination);

                cards.add(card);
            }
        }
        return cards;
    }

    private String numberToDenomination(int number) {
        if (number == 1) {
            return "A";
        } else if (number == 11) {
            return "J";
        } else if (number == 12) {
            return "Q";
        } else if (number == 13) {
            return "K";
        }
        return String.valueOf(number);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for(Card card : cards) {
            sb.append(card.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
