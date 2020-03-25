import java.util.Scanner;

//	uses the instantiable class GuessNumber
//allows the user to guess the number, and then ask the user whether would they like to guess again. 
//If they answer yes, the application should run again, if they answer no, the application should end.

public class GuessApp3 {

	public static void main(String[] args) {
		
		//declare a local variables
		
				int quess;
				String answer = "yes";
				
				Scanner input = new Scanner (System.in);
				GuessNumber checker = new GuessNumber();
				
				//for( int i = 0; i < times; i++) { //not use number
				while (answer. equals("yes")) {
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
					   //  convert the word provided by the user to lower case so that 
				       //the program works independent of the way the user writes 
					System.out.println( "Would they like to guess again: (yes to continue) ");
					answer = input.next().toLowerCase();// not nextIn (string)
				
					
				}//end while
				 int s = checker.getSecret();
				 System.out.println("secret: " + s);
				
				}
	{//end main
    }
}	


