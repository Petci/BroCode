
package brocode;

import java.util.Random;

public class DiceRollerGlobal {
    
    Random rnd;
    int number;
    
    DiceRollerGlobal(){
        rnd = new Random();
        roll(rnd,number);
    }
    
    void roll(Random rnd, int number){
        number = rnd.nextInt(6)+1;
        System.out.println(number);
    }
    
    
}
