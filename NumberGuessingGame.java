import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame
{
    public static int randomGenerater(int high,int low,Random random){
        return random.nextInt(high-low+1) + low;
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Random random = new Random();
	    int low = 1;
	    int high = 100;
	    
	    boolean guessCorrectly = false;
	    System.out.println("Think of a number between 1 to 100 : ");
	    
	    while(!guessCorrectly){
	        int randomNumber = randomGenerater(high,low,random);
	        System.out.println("Is your number is " + randomNumber+ " then enter correct if not enter high,low");
	        String feedback = sc.next();
	        
	        if(feedback.equals("correct")){
	            System.out.println("Yay !,I guessed your number");
	            break;
	        }
	        else if(feedback.equals("high")){
	            high = randomNumber-1;
	        }
	        else if(feedback.equals("low")){
	            low = randomNumber+1;
	        }
	        else{
	            System.out.println("Invalid input");
	        }
	    }
	    
	    
	}
}
// Think of a number between 1 to 100 : 
// Is your number is 13 then enter correct if not enter high,low
// low 
// Is your number is 61 then enter correct if not enter high,low
// high
// Is your number is 37 then enter correct if not enter high,low
// low
// Is your number is 48 then enter correct if not enter high,low
// low
// Is your number is 55 then enter correct if not enter high,low
// high
// Is your number is 54 then enter correct if not enter high,low
// high
// Is your number is 49 then enter correct if not enter high,low
// correct
// Yay !,I guessed your number
