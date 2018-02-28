import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Hand> playerhand;

    public Player (String name){
        this.name = name;
        this.playerhand = new ArrayList<>();
    }

    public void addCard(Card card){
        this.addCard(card);
    }

    public int hasHand(){
        return this.playerhand.size();
    }
}
