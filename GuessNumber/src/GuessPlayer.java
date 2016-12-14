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
		
		System.out.println("V�lkommen till GuessNumber. Din uppgift �r att gissa ett numer mellan 1 - 100");
		
		while(win == false){
			
			System.out.println("Gissa ett numer mellan 1 - 100");
			answer = input.nextInt();
			NumberOfTries++;
		
		if(answer == guess){
			
			win = true;
			
		}
		else if(answer < guess){
			
			System.out.println("F�r kallt, f�rs�k igen!");
		}
		else if(answer > guess){
			
			System.out.println("F�r varmt, f�rs�k igen!");
			
						}
		
				}
		
		
		System.out.println("Korrekt. Du vinner! ");
		
		System.out.println("Det korrekta numret �r " + guess);
		
		System.out.println("Det tog dig " + NumberOfTries + " g�nger att gissa fram r�tt numer");
		
		}
	
}
