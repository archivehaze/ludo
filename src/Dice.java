import java.util.Random;

public class Dice {

    public Dice(){

    }

    public int roll(){
        Random r = new Random();
        int MIN = 1;
        int MAX = 6;
        return r.nextInt(MAX +1- MIN) + MIN;
    }

}
