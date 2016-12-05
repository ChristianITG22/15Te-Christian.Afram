import java.util.Random;
import java.util.Scanner;


public class GuessNumber {

	public static void main(String[]args) {
		
		 Random rand = new Random ();
		 int numberToGuess = rand.nextInt(100);
		 Scanner input = new Scanner (System.in);
		 int guess;
		 boolean win = false;
		 
		 while (win == false) {
			 
			 System.out.println ("Gissa ett nummer mellan 1 - 100");
			 guess = input.nextInt();
			 
			 if(guess == numberToGuess) {
				 win = true;
				 
			 }
			 else if (guess < numberToGuess) {
				 System.out.println ("Det är kallt"); 
				 
			 }
			 else if (guess > numberToGuess) {
				 System.out.println ("Det är för varmt");
				 
			 }
		}
		
		System.out.println("Du vinner!");
		System.out.println("Numret var " + numberToGuess);
		 
	}
	
}
