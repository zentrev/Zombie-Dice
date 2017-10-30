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
        return this.playerName;

    }

    public int braincount(){
        return this.brains;

    }

    public void addbrain(int addbrains){
        this.brains = this.brains+addbrains;

    }



    //We need a method to add brains to a player


}
