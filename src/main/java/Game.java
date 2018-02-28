import java.awt.print.Book;
import java.util.ArrayList;

public class Game {
    private String name;
    private ArrayList<Deck> player1;
    private ArrayList<Deck> player2;

    public Game(String name) {
        this.name = name;
        this.player1 = new ArrayList<>();
        this.player2 = new ArrayList<>();
    }

    public void dealCardToPlayer1(Deck deck, Hand hand, Card card, Player player){
        deck.shuffleDeck();
        hand.addCard(card);
        player.addHand(hand);
        this.player1.add(player);
    }


}
