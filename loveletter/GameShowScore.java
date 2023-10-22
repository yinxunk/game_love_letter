package loveletter;

public class GameShowScore {
    public static void showScore(Players[] player){
        for(int i = 0; i < player.length; i ++){
            int n = player[i].getScore();
            String s=Integer.toString(n);
            System.out.println(player[i].getName() + "score is" + s);
            
        }
        
        
    }
}
