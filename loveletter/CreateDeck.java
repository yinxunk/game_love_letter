package loveletter;

import java.util.ArrayList;
import java.util.Random;

public class CreateDeck {
    public static ArrayList<String> createDeck(){
    ArrayList<String> Characters = new ArrayList<>(16);
    Characters.add("9Princess");
    Characters.add("8Countess");
    Characters.add("7King");
    Characters.add("5Prince");
    Characters.add("5prince");
    Characters.add("4Handmaid");
    Characters.add("4Handmaid");
    Characters.add("3Baron");
    Characters.add("3Baron");
    Characters.add("2Priest");
    Characters.add("2Priest");
    Characters.add("1Guard");
    Characters.add("1Guard");
    Characters.add("1Guard");
    Characters.add("1Guard");
    Characters.add("1Guard");
    int i  = new Random().nextInt(Characters.size());
    Characters.remove(i);
    return Characters;

   }
}
