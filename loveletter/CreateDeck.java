package loveletter;

import java.util.ArrayList;
import java.util.Random;

public class CreateDeck {
    public static ArrayList<Cards> createDeck(){
    ArrayList<Cards> Characters = new ArrayList<>(16);
    Cards princess = new Cards(8, "Princess");
    Cards countess = new Cards(7, "Countess");
    Cards king = new Cards(6, "King");
    Cards prince =  new Cards(5, "Prince");
    
    Cards handmaid = new Cards(4, "Handmaid");
    
    Cards baron = new Cards(3, "Baron");
    
    Cards priest = new Cards(2, "Priest");
    
    Cards guard = new Cards(1, "Guard");
    

    Characters.add(princess);
    Characters.add(countess);
    Characters.add(prince);
    Characters.add(prince);
    Characters.add(handmaid);
    Characters.add(handmaid);
    Characters.add(baron);
    Characters.add(baron);
    Characters.add(king);
    Characters.add(priest);
    Characters.add(priest);
    Characters.add(guard);
    Characters.add(guard);
    Characters.add(guard);
    Characters.add(guard);
    Characters.add(guard);
    
    int i  = new Random().nextInt(Characters.size());
    Cards setaside = Characters.remove(i);
    return Characters;

   }
}
