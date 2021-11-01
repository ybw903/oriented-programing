import java.util.ArrayList;
import java.util.List;

public class Gamer implements Player{
    private List<Card> cards;
    private boolean turn;
    private String name;

    public Gamer(String name) {
        this.cards = new ArrayList<>();
        this.name = name;
    }

    public void setTurn(boolean turn) {
        this.turn = turn;
    }

    @Override
    public void receiveCard(Card card) {
        this.cards.add(card);
    }

    @Override
    public List<Card> openCards() {
        return this.cards;
    }

    @Override
    public void showCards() {
        StringBuilder sb = new StringBuilder();
        sb.append("헌재 보유 카드 목록\n");

        for (Card card : cards) {
            sb.append(card.toString());
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    @Override
    public void turnOff() {
        this.setTurn(false);
    }

    @Override
    public void turnOn() {
        this.setTurn(true);
    }

    @Override
    public boolean isTurn() {
        return this.turn;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
