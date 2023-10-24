package loveletter;

import java.util.ArrayList;

public class Cards {
    private int number;
    private String name;

    public Cards(int number, String name){
        this.number = number;
        this.name = name;
    }

    public int getNumber(){
        return this.number;
    }
    public String getName(){
        return this.name;
    }
    //if discarded in any way, the player loses this round
    void PrincessAnnette(Players player){
        player.stillInRound(false);
    }
    //If King or Prince is in hands, Countess must be discarded. Countess playable even without King or Prince.
     static void CountessWilhelmina(Players player){
        if(player.getHands().contains("6King") || player.getHands().contains("5Prince")){
            player.getHands().remove("Countess");
        }
        else if(player.getPlayedCard() == "Countess" ){
            player.getHands().remove("Countess");
        }
    }
    //When played, trade cards with a selected player that is still in the game.
     static void KingArnaud(Players player1, Players player2){
        Cards player1card = player1.getHands().get(0);
        Cards player2card = player2.getHands().get(0);
        player2.getHands().remove(player2card);
        player2.getHands().add(player1card); 
        player1.getHands().remove(player1card);
        player1.getHands().add(player2card);
        
    }
    //When played, a selected player in game must discard his/her hand and draws a new one.
    //If the deck is empty, selected player will take the card left aside at the start ofthe round.
    //Player who played the Prince must choose him/herself, if everyone else is protected by handmaid.
    static void PrinceArnaud(Players player2, ArrayList<Cards> currentdeck, Cards setaside){
        player2.getHands().clear();
        if(!currentdeck.isEmpty()){
            GameDrawCard.drawCard(player2, currentdeck);
        }
        else{
            player2.getHands().add(setaside);
        }
       
        
    }
    //When played, player gets immunity to all effects of other player's cards until start of next round.
    void HandmaidSusannah(){
        System.out.println("This player is now protected by the handmaid until next round");
    }
    //When played, compare cards with a selected player. Player with lower number loses the round.
    //if tie, nothing happens
    void BaronTalus(Players player1, Players player2){
        if(player1.getHands().get(0).getNumber() > player2.getHands().get(0).getNumber()){
            player2.stillInRound(false);
        }
    }
    //When played, select another player and look at his/her hand.
    void PriestTomas(Players player2){
        GameShowHand.showHand(player2);
    }
    //When played, name a number and select a player. If stated number is the player's card number,
    //he/she is knocked out of the game. Card has no effect if everyone is protected.
    void GuardOdette(int number, Players player2){
        if(player2.getPlayedCard() != "Handmaid"){
            if(player2.getHands().get(0).getNumber() == number){
                player2.stillInRound(false);
            }
        }
        else{
            System.out.println("this player is protected by the handmaid, next time, choose wisely");
        }
    }
}