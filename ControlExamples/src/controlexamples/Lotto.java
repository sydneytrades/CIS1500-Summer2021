
package controlexamples;

import java.util.Arrays;
import java.util.Random;


public class Lotto {
    private int[] numbers;
    
    public Lotto(){
        Random random = new Random();
        numbers = new int[5];
        
        for ( int index = 0; index < numbers.length; index++){
            numbers[index] = random.nextInt(10);
        }
    }
    
    public Lotto(int[] numbers){
        this.numbers = Arrays.copyOf(numbers, 5);
    }
    
    public int[] getNumbers(){
        return Arrays.copyOf(numbers, 5);
    }
    
    public int getWinnings(Lotto winningTicket){
        for(int index = 0; index < numbers.length; index++){
            if ( numbers[index] != winningTicket.numbers[index]){
                return 0;
            }
        }
        return 50_000;
    }
}
