public class Game {
    public void play() {
        System.out.println("======== Blackjack Game========");
        Dealer dealer = new Dealer();
        Gamer gamer = new Gamer();
        Rule rule = new Rule();
        CardDeck cardDeck = new CardDeck();
    }
}
