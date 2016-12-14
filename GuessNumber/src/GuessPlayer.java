import java.util.Random;
import java.util.Scanner;


public class GuessPlayer {

	public static void main(String[]args){
		
		Random rand = new Random();
		int guess = rand.nextInt(100)+1;
		int NumberOfTries = 0; 
		Scanner input = new Scanner(System.in);
		int answer;
		boolean win = false;
		
		System.out.println("Välkommen till GuessNumber. Din uppgift är att gissa ett numer mellan 1 - 100");
		
		while(win == false){
			
			System.out.println("Gissa ett numer mellan 1 - 100");
			answer = input.nextInt();
			NumberOfTries++;
		
		if(answer == guess){
			
			win = true;
			
		}
		else if(answer < guess){
			
			System.out.println("För kallt, försök igen!");
		}
		else if(answer > guess){
			
			System.out.println("För varmt, försök igen!");
			
						}
		
				}
		
		
		System.out.println("Korrekt. Du vinner! ");
		
		System.out.println("Det korrekta numret är " + guess);
		
		System.out.println("Det tog dig " + NumberOfTries + " gånger att gissa fram rätt numer");
		
		}
	
}
