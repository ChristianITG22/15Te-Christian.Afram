import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static void main(String[]args) {
		
		//Systemobjekt
		
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		
		//Spelvariabler
		
		String[] fiender = { "Imp", "Zombie", "Assasin", "Samuraj" }; //Håller reda på alla fienders namn
		int maxFiendeHälsa = 90; 						//Maximala hälsan fienden kan ha
		int skadaFiende = 35; 							//Maximala skadan en fiende kan göra på dig
		int antalFienderBesegrade = 0;
		
		// Variabler för spelaren
		
		int hälsa = 120;					// Spelarens liv
		int skada = 50;						// Skada på fienden		
		int antalHälsoDryck = 3; 			// Antalet Health potions spelaren har från start
		int hälsoDryckMängd = 25; 		    // Mängden hälsa man får efter en Potion
		int hälsoDryckChans = 50;			// Sannolikhet för fienden att droppa en Health potion (Procent %)
		
		
		boolean running = true;
		
		System.out.println("");
		System.out.println("\tVälkommen till The Forbidden Realm");
		
		GAME:
			while(running) {
				
				System.out.println("-----------------------------------");
				
				int fiendeHälsa = rand.nextInt(maxFiendeHälsa);				
				String fiende = fiender[rand.nextInt(fiender.length)];		// Kommer åt Stringen enemies
				
				System.out.println("\tEn " + fiende + " har dykit upp!");   // En fiende Spawnar
				
				while(fiendeHälsa > 0){
					
					System.out.println("\tDin hälsa: " + hälsa);
					System.out.println("\t" + fiende + "s hälsa: " + fiendeHälsa);
					System.out.println("\n\tVad vill du göra?");
					System.out.println("-----------------------------------");
					System.out.println("\t1. Anfalla");
					System.out.println("\t2. Drick en potion");
					System.out.println("\t3. Spring iväg");
					
					System.out.println("-----------------------------------");



					String input = in.nextLine();
					
					if(input.equals("1")) {
						
						int givenSkada = rand.nextInt(skada);
						int tagenSkada = rand.nextInt(skadaFiende);
						
						fiendeHälsa -= givenSkada;
						hälsa -= tagenSkada;
						
						System.out.println("\tDu anföll " + fiende + " och tog " + givenSkada + " HP");
						System.out.println("\t" + fiende + " attackerade dig och tog " + tagenSkada + " HP!");
						
						if (hälsa < 1) {
							
							System.out.println("\tDu är alldeles för skadad för att anfalla");
							break;
						}
					}
					
					else if (input.equals("2")) {
						
						if(antalHälsoDryck > 0) {
							hälsa += hälsoDryckMängd;
	
							antalHälsoDryck--;
							
							System.out.println("\tDu dricker en potion som ger dig " + hälsoDryckMängd + " HP."
							+ "\n\t Du har nu " + hälsa + " HP."
								+ "\n\t Du har just nu " + antalHälsoDryck + " potion(s) kvar.\n" );
							
							
						}
						
						else {
							
							System.out.println("\tDu har inga fler potions! Besegra dina fiender för en chans om fler.");
							
						}
					}
					
					else if(input.equals("3")){
						
						System.out.println("\tDu flydde från " + fiende + "!");
						continue GAME;
					
					}
					else {
						System.out.println("\tOgiltig kommando!");
					}
				
				}
				
				if (hälsa < 1) {
					
					System.out.println("\tDu besegrades tyvärr, men mycket bra jobbat. Du lyckades besegra " + antalFienderBesegrade + " monster." );
					break;
				}
				
				System.out.println("-----------------------------------");
				System.out.println(" \t# " + fiende + " besegrades! #");
				System.out.println(" \t# Du har " + hälsa + " HP kvar! # ");
				antalFienderBesegrade++;
				
				if(rand.nextInt(100) < hälsoDryckChans) {
					antalHälsoDryck++;
					
					System.out.println(" \t# " + fiende + " droppade en potion! # ");
					System.out.println(" \t# Du har just nu " + antalHälsoDryck + " potion(s)! # ");
					
				}
				
				System.out.println("-----------------------------------");
				System.out.println("\tVad vill du göra nu?");
				System.out.println("\t1. Fortsätta spela");
				System.out.println("\t2. Avsluta spelet");
				
				String input = in.nextLine();
				
				while(!input.equals("1") && !input.equals("2")) {
					
					System.out.println("\tOgiltigt kommando!");
				}
				
				if(input.equals("1")) {
					
					System.out.println("\tDu väljer att fortsätta spela.\n\tBra val, och lycka till!");
				}
				
				else if(input.equals("2")) {
					
					System.out.println("\tDu väljer att avsluta spelet.");
					break;
					
				}

			}
			
		System.out.println(" \t******************************** ");
		System.out.println(" \t* TACK FÖR ATT DU SPELADE! :-) * ");
		System.out.println(" \t******************************** ");
		
		}
	}


