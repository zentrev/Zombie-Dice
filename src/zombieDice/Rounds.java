package zombieDice;

public class Rounds {
        //Should set shots and brains to 0 and dice != runner (see below)
        //check if strikes are lower then 3 if not end round
        //run turns until round is over
        //stores brains until round is over
        //give option to end round and collect current brains
        //we need to set the dice array in turns to shots or brains, This way we don't carry the runners from the last round


    public static void Round(int playerNumber){
        int shots = 0;
        while (shots < 3) {
            Turns.takeTurn();
            shots = Turns.returnShots();
            System.out.println(shots);
        }

       // Player.get(playerNumber);

        //Placeholder2 players = new Placeholder2();
    }
}
