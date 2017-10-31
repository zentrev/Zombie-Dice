package zombieDice;

//import Frame.PlayerPanel;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;

public class Game {
    public static void startGame() {

        //makes players
        //goes threw every players rounds
        //once a player gets 13 brains run one round for every other player
        //end the game showing the winner

        //Variables
        Scanner scanner = new Scanner(System.in);
        List<Players> Player = new LinkedList<Players>();

        String playerx = "";
        String input;
        boolean makePlayer = true;
        boolean nameCheck = true;
        boolean playRounds = true;
        int listLength = 0;
        int currentPlayer = 0;
        int winNumber = 0;
        int winPlayer = 0;

        //Player Creation
        while (makePlayer) {
            while (nameCheck) {
                System.out.println("Please enter the name of the Player: ");
                playerx = scanner.nextLine();
                if (!playerx.equals("")) {
                    nameCheck = false;
                }
            }

            Player.add(new Players(playerx));
            //PlayerPanel.PlayerEdit(playerx);

            System.out.println("Is there another player?: (Y/N)");
            input = scanner.nextLine();

            if (!input.equalsIgnoreCase("y")) {
                makePlayer = false;
            }else{
                nameCheck = true;
            }
        }

        //Finds number of players
        for (Players x : Player) {
            listLength++;
        }

        //plays rounds
        while (playRounds){
            for (int i = 0; i < listLength; i++){
                System.out.println("\u001B[1m" + Player.get(i).getPlayerName() + "'s Turn! (enter to continue)");
                String con = scanner.nextLine();
                Rounds.Round(i, Player);
                if (Player.get(i).braincount() >= 13) {
                    System.out.println("\u001B[1m" + "\u001B[30m" + "\u001b[41m" + Player.get(i).getPlayerName() + " has eaten " + Player.get(i).getBrains() + " Brains, you each get one shot to beet that!");
                    currentPlayer = i+1;
                    i = listLength+1;
                    playRounds = false;
                }
            }


        }

        for (int i = 0; i < listLength -1; i++){
            if(currentPlayer == listLength){
                currentPlayer = 0;
            }
            Rounds.Round(currentPlayer, Player);
            currentPlayer++;
        }


        for (int i = 0; i < listLength; i++){
            if(Player.get(i).braincount() > winNumber){
                winNumber = Player.get(i).braincount();
                winPlayer = i;
            }
        }
        System.out.println("\u001B[1m" + "\u001B[32m" + "\u001b[44m"  + Player.get(winPlayer).getPlayerName() + " Won with " + winNumber + " Brains!");


    }
}

