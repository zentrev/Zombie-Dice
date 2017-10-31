package zombieDice;

public class Dice {
    //make dice object that can be red yellow or green
    //holds status of die, brain-runner-shot
    //has ability not to change dice in case it lands on runner
    

    private String color;
    private String status;

    public void die(){
        this.color = "";
        this.status = "";
    }

    public String getColor(){return color;}
    public String getStatus(){return status;}
    public void setStatus(String stat){
        this.status = stat;
    }

}
