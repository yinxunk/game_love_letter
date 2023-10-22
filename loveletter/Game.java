package loveletter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.stream.events.Characters;



public class Game {
    

public static void game(){
    Players[] playersingame = GameStart.start();
    ArrayList<String> deck = CreateDeck.createDeck();
    for(int i = 0; i < playersingame.length; i++){
        GameDrawCard.drawCard(playersingame[i], deck);
    }
    
    Scanner scannerforgame = new Scanner(System.in);
    System.out.println("To play a card, please type \\playCard");
    String play = scannerforgame.nextLine();
    if(play.equals("\\playCard")){
        GamePlayCard.playCard(playersingame[0], deck);
    }
    else{
        System.out.println("make sure you spelled correctly");
    }
    
    System.out.println("To show the hand of the current player, please type \\playCard");
    String showhand = scannerforgame.nextLine();
    if(showhand.equals("\\showHand")){
        GameShowHand.showHand(playersingame[0]);
    }
    else{
        System.out.println("error, check for spelling");
    }
    
    System.out.println("To show the score of all the players, please type \\showScore");
    String showscore = scannerforgame.nextLine();
    if(showscore.equals("\\showScore")){
        GameShowScore.showScore(playersingame);
    }
    else{
        System.out.println("error, check for spelling");
    }

    

    

     

    System.out.println(GameShowHand.showHand(playersingame[1]));



    
}
    
    
    public static void main(String[] args) {
        game();
    }
}
