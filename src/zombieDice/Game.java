package zombieDice;

import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;

public class Game {
    public static void startGame() {
        Scanner scanner = new Scanner(System.in);

List<Players> Player = new LinkedList<Players>();
Player = new LinkedList<Players>();

        //makes players
        //goes threw every players rounds
        //once a player gets 13 brains run one round for every other player
        //end the game showing the winner


// for some reasons the two scanners are not the same

        boolean p = true;
        boolean n = true;
        String playerx = "";
        while (p) {
            while (n) {
                System.out.println("Please enter the name of the Player: ");
                playerx = scanner.nextLine();
                if (!playerx.equals("") && playerx.length() > 0) {
                    n = false;
                }
            }

            Player.add(new Players(playerx));
            System.out.println("Is there another player?: ");
            String input = scanner.nextLine();

            if (!input.equalsIgnoreCase("yes")) {
                p = false;
            }else{
                n = true;
            }
        }






        int listLenght = 0;

        for (Players x : Player) {
            listLenght++;
        }


boolean r = true;

        System.out.println(Player.get().players());


        while (r){
            for (int i = 0; i < listLenght; i++){
                Rounds.Round(i);
if (Player.get(i).braincount() >= 13) {
    i = listLenght+1;
    r = false;
}
            }
        }
    }
}

