package zombieDice;

public class Dice {
    //make dice object that can be red yellow or green
    //holds status of die, brain-runner-shot
    //has ability not to change dice in case it lands on runner


    private String color = null;
    private String status = "";

    public Dice() {
        this.color = "";
        this.status = "";

    }

    public String getColor() {
        return color;


    }

    public String getStatus() {
        return status;


    }

    public void changeColor() {
        int Rando = (int) (Math.random() * 100);
        if (Rando <= 46) {
            this.color = "green";


        }
        else if (Rando > 46 && Rando <= 77){
            this.color = "yellow";
        }
        else (Rando > 77){
            this.color = "RED";
        }
    }

}
