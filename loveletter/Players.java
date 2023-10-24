package loveletter;

import java.util.ArrayList;

public class Players {
    private String name;
    private int score;
    private boolean stillinround;
    private String playedcard;
    //private int highestnumber;
    
    private ArrayList<Cards> hands = new ArrayList<>(2);
    

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
    
    public ArrayList<Cards> getHands(){
        return this.hands;
    }
    public String getPlayedCard(){
        return this.playedcard;
    }
    void playedCard(String card){
        this.playedcard = card;
    }
    //public int getHighestNumber(){
        //return this.highestnumber;
    //}
    public boolean getStillInRound(){
        return this.stillinround;
    }
    void stillInRound(boolean truefalse){
        this.stillinround = truefalse;
    }
}
