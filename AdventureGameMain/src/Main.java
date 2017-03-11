import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static void main(String[]args) {
		
		//Systemobjekt
		
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		
		//Spelvariabler
		
		String[] fiender = { "Imp", "Zombie", "Assasin", "Samuraj" }; //H�ller reda p� alla fienders namn
		int maxFiendeH�lsa = 90; 						//Maximala h�lsan fienden kan ha
		int skadaFiende = 35; 							//Maximala skadan en fiende kan g�ra p� dig
		int antalFienderBesegrade = 0;
		
		// Variabler f�r spelaren
		
		int h�lsa = 120;					// Spelarens liv
		int skada = 50;						// Skada p� fienden		
		int antalH�lsoDryck = 3; 			// Antalet Health potions spelaren har fr�n start
		int h�lsoDryckM�ngd = 25; 		    // M�ngden h�lsa man f�r efter en Potion
		int h�lsoDryckChans = 50;			// Sannolikhet f�r fienden att droppa en Health potion (Procent %)
		
		
		boolean running = true;
		
		System.out.println("");
		System.out.println("\tV�lkommen till The Forbidden Realm");
		
		GAME:
			while(running) {
				
				System.out.println("-----------------------------------");
				
				int fiendeH�lsa = rand.nextInt(maxFiendeH�lsa);				
				String fiende = fiender[rand.nextInt(fiender.length)];		// Kommer �t Stringen enemies
				
				System.out.println("\tEn " + fiende + " har dykit upp!");   // En fiende Spawnar
				
				while(fiendeH�lsa > 0){
					
					System.out.println("\tDin h�lsa: " + h�lsa);
					System.out.println("\t" + fiende + "s h�lsa: " + fiendeH�lsa);
					System.out.println("\n\tVad vill du g�ra?");
					System.out.println("-----------------------------------");
					System.out.println("\t1. Anfalla");
					System.out.println("\t2. Drick en potion");
					System.out.println("\t3. Spring iv�g");
					
					System.out.println("-----------------------------------");



					String input = in.nextLine();
					
					if(input.equals("1")) {
						
						int givenSkada = rand.nextInt(skada);
						int tagenSkada = rand.nextInt(skadaFiende);
						
						fiendeH�lsa -= givenSkada;
						h�lsa -= tagenSkada;
						
						System.out.println("\tDu anf�ll " + fiende + " och tog " + givenSkada + " HP");
						System.out.println("\t" + fiende + " attackerade dig och tog " + tagenSkada + " HP!");
						
						if (h�lsa < 1) {
							
							System.out.println("\tDu �r alldeles f�r skadad f�r att anfalla");
							break;
						}
					}
					
					else if (input.equals("2")) {
						
						if(antalH�lsoDryck > 0) {
							h�lsa += h�lsoDryckM�ngd;
	
							antalH�lsoDryck--;
							
							System.out.println("\tDu dricker en potion som ger dig " + h�lsoDryckM�ngd + " HP."
							+ "\n\t Du har nu " + h�lsa + " HP."
								+ "\n\t Du har just nu " + antalH�lsoDryck + " potion(s) kvar.\n" );
							
							
						}
						
						else {
							
							System.out.println("\tDu har inga fler potions! Besegra dina fiender f�r en chans om fler.");
							
						}
					}
					
					else if(input.equals("3")){
						
						System.out.println("\tDu flydde fr�n " + fiende + "!");
						continue GAME;
					
					}
					else {
						System.out.println("\tOgiltig kommando!");
					}
				
				}
				
				if (h�lsa < 1) {
					
					System.out.println("\tDu besegrades tyv�rr, men mycket bra jobbat. Du lyckades besegra " + antalFienderBesegrade + " monster." );
					break;
				}
				
				System.out.println("-----------------------------------");
				System.out.println(" \t# " + fiende + " besegrades! #");
				System.out.println(" \t# Du har " + h�lsa + " HP kvar! # ");
				antalFienderBesegrade++;
				
				if(rand.nextInt(100) < h�lsoDryckChans) {
					antalH�lsoDryck++;
					
					System.out.println(" \t# " + fiende + " droppade en potion! # ");
					System.out.println(" \t# Du har just nu " + antalH�lsoDryck + " potion(s)! # ");
					
				}
				
				System.out.println("-----------------------------------");
				System.out.println("\tVad vill du g�ra nu?");
				System.out.println("\t1. Forts�tta spela");
				System.out.println("\t2. Avsluta spelet");
				
				String input = in.nextLine();
				
				while(!input.equals("1") && !input.equals("2")) {
					
					System.out.println("\tOgiltigt kommando!");
				}
				
				if(input.equals("1")) {
					
					System.out.println("\tDu v�ljer att forts�tta spela.\n\tBra val, och lycka till!");
				}
				
				else if(input.equals("2")) {
					
					System.out.println("\tDu v�ljer att avsluta spelet.");
					break;
					
				}

			}
			
		System.out.println(" \t******************************** ");
		System.out.println(" \t* TACK F�R ATT DU SPELADE! :-) * ");
		System.out.println(" \t******************************** ");
		
		}
	}


