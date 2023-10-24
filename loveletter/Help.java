package loveletter;

public class Help {
    static void help(){
        System.out.println("Here are some tips:");
        System.out.println("Card effects:");
        System.out.println(" _____________________________________________________________________________________________________________________________");
        System.out.println("|8PRINCESS:if discarded in any way, the player loses this round.                                                              |");
        System.out.println("|_____________________________________________________________________________________________________________________________|");
        System.out.println("|7COUNTESSWILHELMILA: If King or Prince is in hands, Countess must be discarded. Countess playable even without King or Prince|");
        System.out.println("|                                                                                                                             |");
        System.out.println("|6KINGARNAUD:When played, trade cards with a selected player that is still in the game                                        |");
        System.out.println("|                                                                                                                             |");
        System.out.println("|5PRINCEARNAUD:When played, a selected player in game must discard his/her hand and draws a new one.                          |");
        System.out.println("|              If the deck is empty, selected player will take the card left aside at the start ofthe round.                  |");
        System.out.println("|              Player who played the Prince must choose him/herself, if everyone else is protected by a handmaid.             |");
        System.out.println("|                                                                                                                             |");
        System.out.println("|4HANDMIANDSUSANNAH:When played, player gets immunity to all effects of other player's cards until start of next round.       |");
        System.out.println("|                                                                                                                             |");
        System.out.println("|3BARONTALUS:When played, compare cards with a selected player. Player with lower number loses the round.                     |");
        System.out.println("|            if the score is tied, nothing happens                                                                            |");
        System.out.println("|                                                                                                                             |");
        System.out.println("|2PRIESTTOMAS:When played, select another player and look at his/her hand.                                                    |");
        System.out.println("|                                                                                                                             |");
        System.out.println("|1GUARDODETTE:When played, name a number and select a player. If stated number is the player's card number,                   |");
        System.out.println("|             he/she is knocked out of the game. Card has no effect if everyone is protected.                                 |");
        System.out.println("|_____________________________________________________________________________________________________________________________|");

        System.out.println("playing commands:");

    }
    public static void main(String[] args) {
        help();
    }
}
