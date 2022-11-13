package brocode;

import java.util.Random;

public class DiceRoller {
    
    DiceRoller(){
        Random rnd = new Random();
        int number = 0;
        roll(rnd,number);
    }
    
    void roll(Random rnd, int number){
        number = rnd.nextInt(6)+1;
        System.out.println(number);
    }
    
}
