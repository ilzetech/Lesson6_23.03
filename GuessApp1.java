import GuessNumber;
import java.util.Scanner;
public class GuessApp1 {

	public static void main(String[] args) {
	

//devlare a local variables
	
	int quess;
	
	Scanner input = new Scanner (System.in);
	GuessNumber checker = new GuessNumber();
	
	for( int i = 0; i < 3; i++) { //3 vill be sv=canner at home task
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

		
		
		
		
		

	