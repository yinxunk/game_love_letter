package loveletter;

import java.util.ArrayList;
import java.util.Random;

public class CreateDeck {
    public static ArrayList<Cards> createDeck(){
    ArrayList<Cards> Characters = new ArrayList<>(16);
    Characters.add(new Cards(8, "Princess"));
    Characters.add(new Cards(7, "Countess"));
    Characters.add(new Cards(6, "King"));
    Characters.add(new Cards(5, "Prince"));
    Characters.add(new Cards(5, "Prince"));
    Characters.add(new Cards(4, "Handmaid"));
    Characters.add(new Cards(4, "Handmaid"));
    Characters.add(new Cards(3, "Baron"));
    Characters.add(new Cards(3, "Baron2"));
    Characters.add(new Cards(2, "Priest"));
    Characters.add(new Cards(2, "Priest"));
    Characters.add(new Cards(1, "Guard"));
    Characters.add(new Cards(1, "Guard"));
    Characters.add(new Cards(1, "Guard"));
    Characters.add(new Cards(1, "Guard"));
    Characters.add(new Cards(1, "Guard"));
    
    int i  = new Random().nextInt(Characters.size());
    Cards setaside = Characters.remove(i);
    return Characters;

   }
}
