package loveletter;

import java.util.ArrayList;
import java.util.Random;

public class GameDrawCard {
    public static void drawCard(Players player, ArrayList<Cards> deck ){
        

        
        
        int rnd = new Random().nextInt(deck.size());
        
        //System.out.println("Drawn card is " + deck.get(rnd));
        player.getHands().add(deck.get(rnd));
        deck.remove(rnd);
        
        
    }  
    public static void main(String[] args) {
        ArrayList<Cards> Char = CreateDeck.createDeck();
        for(int i = 0; i < Char.size(); i++ ){
            System.out.print(Char.get(i) + "|");
        }
        Players yinxun = new Players("yx", 0);
        drawCard(yinxun, Char);
        
        for(int i = 0; i < Char.size(); i++ ){
            System.out.print(Char.get(i) + "|");
        }
        

    } 

}
