import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> currenthand;

    public Hand(){
        this.currenthand = new ArrayList<Card>();
    }

    public void addCard(Card card){
        this.currenthand.add(card);
    }

    public int cardsInHand(){
        return this.currenthand.size();
    }
}
