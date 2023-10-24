package loveletter;



import java.util.ArrayList;
import java.util.Scanner;

public class GamePlayCard{
    public static void playCard(Players player, ArrayList<Cards> characters){
        GameDrawCard.drawCard(player, characters );
        System.out.println("Only the cards in your hand can be played");
        System.out.println(GameShowHand.showHand(player));
        Scanner playedcard = new Scanner(System.in);
        System.out.println("Choose a card to play");
        String card = playedcard.nextLine();
        if(player.getHands().contains(card)){
            player.getHands().remove(card);
            player.playedCard(card);
            System.out.println("player played" + player.getPlayedCard());

        }
        else{
            System.out.println("You can't play something you don't have");
        }
        
        
        
        

    }

}