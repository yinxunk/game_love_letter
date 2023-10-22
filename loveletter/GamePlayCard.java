package loveletter;



import java.util.ArrayList;
import java.util.Scanner;

public class GamePlayCard{
    public static void playCard(Players player, ArrayList<String> characters){
        GameDrawCard.drawCard(player, characters );
        System.out.println("Only the cards in your hand can be played");
        System.out.println(GameShowHand.showHand(player));
        System.out.println("Choose a card to play");
        Scanner playedcard = new Scanner(System.in);
        if(true){
            //to check if the selected card is in the hands of the current player
        }
        else{}
        String card = playedcard.nextLine();
        player.getHands().remove(card);
        System.out.println(GameShowHand.showHand(player));
        

    }

}