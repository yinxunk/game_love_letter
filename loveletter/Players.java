package loveletter;

import java.util.ArrayList;

public class Players {
    private String name;
    private int score;
    
    private ArrayList<String> hands = new ArrayList<>(2);
    

    public Players(String name, int score){
        this.name = name;
        this.score = score;
    }
    public int getScore(){
        return this.score;
    }
    public String getName(){
        return this.name;
    }
    
    public ArrayList<String> getHands(){
        return this.hands;
    }
}
