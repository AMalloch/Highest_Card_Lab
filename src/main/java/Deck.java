import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> cards;

    public Deck(){
        this.cards = new ArrayList<>();
    }

    public void createDeck(){
        for(SuitType suit : SuitType.values()) {
            for (ValueType value : ValueType.values()){
                Card card = new Card(suit, value);
            }
        }
    }

    public void addCards(){
        this.createDeck();
//        this.cards.createDeck()
    }

    public int countDeck(){
        return this.cards.size();
    }

}
