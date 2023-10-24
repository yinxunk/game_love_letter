package loveletter;

import java.util.Scanner;

public class GameStart {
    public static Players[] start(){
        
        Scanner startprompt = new Scanner(System.in);
        System.out.println("To start the game, please type \\start");
        String executestartprompt = startprompt.nextLine();
        Players[] playeringame = new Players[4];
        
        if(executestartprompt.equals("\\start")){
            System.out.println("Welcome to a game, where mind tricks are the weapons of players");
            System.out.println("How many players are there?");
            Scanner playeramount = new Scanner(System.in);
            int number = playeramount.nextInt();
            System.out.println("Enter first player name:");
            Scanner playername = new Scanner(System.in);
            String playerone = playername.nextLine();
            playeringame[0] = new Players(playerone, 0);
            
            

            if(number == 2){
                String[] name = new String[2];
                for(int i = 1; i < number; i++){
                    System.out.println("Please enter the name of the next player:");
                    name[i -1] = playername.nextLine();
                    playeringame[i] = new Players(name[i -1 ], 0);
                }

            }
            else if(number == 3){
                String[] name = new String[3];
                for(int i = 1; i < number; i++){
                    System.out.println("Please enter the name of the next player:");
                    name[i -1] = playername.nextLine();
                    playeringame[i] = new Players(name[i -1 ], 0);
                }
            }
            else if(number == 4){
                String[] name = new String[4];
                for(int i = 1; i < number; i++){
                    System.out.println("Please enter the name of the next player:");
                    name[i -1] = playername.nextLine();
                    playeringame[i] = new Players(name[i -1 ], 0);
                }
            }
            System.out.println("lets begin!");

        }
        else{
            System.out.println("Please make sure you spelled corerectly");
            start();
            

            
        }

        return playeringame;

    
    }
    public static void main(String[] args) {

        start();
        
    }

}

