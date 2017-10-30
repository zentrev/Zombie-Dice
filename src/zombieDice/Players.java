package zombieDice;

public class Players {

    private String playerName = "";
    private int brains = 0;

    public Players(String playerSet){
        this.playerName = playerSet;
        this.brains = 0;
    }

    //makes object of players
    public String players(){
        return playerName;

    }

    public int braincount(){
        return brains;

    }
    //keep track of players brains and name

    //encapsulation to access and edit player information


}
