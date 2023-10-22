package loveletter;

public class GameShowHand {
    public static String showHand(Players player){
        String cardsinhand = " ";
        for(int i = 0; i < player.getHands().size(); i++ ){
            cardsinhand += player.getHands().get(i);

        }   
        return "you are holding the card: " + cardsinhand;
    }
}
