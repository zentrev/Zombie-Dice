package zombieDice;

public class Dice {
    //make dice object that can be red yellow or green
    //holds status of die, brain-runner-shot
    //has ability not to change dice in case it lands on runner
    //hello

    public String color = "green";
    private String status = "";

    public Dice(){
        color = "green";
        status = "runner";
    }

    public String getColor(){return color;}
    public String getStatus(){return status;}
    public void setStatus(String stat){
        this.status = stat;
    }
    public void setColor(String col){
        this.color = col;
    }

}
