import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> deck;

    public Deck(){
        this.deck = deck;
    }

    public void fillArray(Card card){
        for(SuitType suit : SuitType.values()) {
            for (ValueType value : ValueType.values()){  // c for card
                    this.deck.add(card);

            }
        }
    }

    public int countDeck(){
        return this.deck.size();
    }

}
