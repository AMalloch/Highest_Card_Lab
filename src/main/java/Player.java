import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Hand> playerhand;

    public Player (String name){
        this.name = name;
        this.playerhand = new ArrayList<>();
    }

    public void addHand(Hand hand){
        this.playerhand.add(hand);
    }

    public int hasHand(){
        return this.playerhand.size();
    }
}
