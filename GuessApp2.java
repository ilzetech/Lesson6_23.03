//uses the instantiable class GuessNumber
//allows the user to guess the number. User can enter the guess number!
import java.util.Scanner;
public class GuessApp2 {

	public static void main(String[] args) {
		
		//declare a local variables
		
		int quess;
		
		Scanner input = new Scanner (System.in);
		GuessNumber checker = new GuessNumber();
		
		for( int i = 0; i < times; i++) { //not use number
		//input 
			System.out.println( "Enter to quess the number: ");
		
			quess = input.nextInt();
			
			checker.setGuess(quess);
			
			//processing
			checker.compute();
			//output 
			String m = checker.getMessage();
			System.out.println(m);
			
			if (m.equals("congrats")) {
				break;
				
			}
			
			
		}//end for
		 int s = checker.getSecret();
		 System.out.println("secret: " + s);
		
		}
		
		
	}//end main
