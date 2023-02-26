import java.util.Scanner;
import java.util.Random;

public class BlackJack {
	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		Random rand = new Random();

		int f;
		int s;
		int l;
		int total;
		String answer = "";
		int newTotal;
		Boolean playing = true;
		int newDealer;
		int dealer;
		String contin = "";
		
		f = rand.nextInt(1, 11);
		s = rand.nextInt(1, 11);
		l = rand.nextInt(1, 11);
		dealer = rand.nextInt(1,11);
		
		total = f + s;
		newTotal = total + l;

		while(playing) {
		
		System.out.println("First cards: " + f + ", " + s);
		System.out.println("Total: " + total);

		
		
		while (!answer.equals("n") && !answer.equals("N")) {

			System.out.println("Do you want to hit? (y/n): ");
			answer = scnr.nextLine();

			if ((answer.equals("y") || answer.equals("Y")) && newTotal < 21) {
				System.out.println("Card: " + l);
				l = rand.nextInt(1, 11);
				System.out.println("Your Total: " + newTotal);
				newTotal += l;
			
			
			} else if ((answer.equals("y") || answer.equals("Y")) && newTotal > 21) {
				System.out.println("Card: " + l);
				System.out.println("Total: " + newTotal);
				System.out.println("Busted");
				break;
			}
		
			  else if ((answer.equals("y") || answer.equals("Y")) && newTotal == 21) {
				System.out.println("Card: " + l);
				System.out.println("Total: " + newTotal);
				System.out.println("Winner winner Chicken Dinner!");
				break;
				}
			
			 if (answer.equalsIgnoreCase("n")) {
				  
				  newDealer = 0;
				  newTotal -= l;
				  newDealer += dealer;
				  System.out.println("\nDealer Draws: " + dealer);
				  dealer = rand.nextInt(1,11);
				  System.out.println("Dealer Totoal: " + newDealer);
				  
		while (answer.equals("n") && newDealer < newTotal || newDealer < 17) {
			 
			
			
			newDealer += dealer;
			System.out.println("\nPress any key to continue...");
			contin = scnr.nextLine();
			
			if (answer.equals("n") && newDealer < newTotal && (newDealer < 17)) {
			
			
			System.out.println("\nDealer Draws: " + dealer);
			dealer = rand.nextInt(1,10);
			System.out.println("Dealer Totoal: " + newDealer);
			
			}  
			 if (answer.equals("n") && (newDealer > newTotal && newDealer <= 21)) {
				  
				 System.out.println("\nDealer Draws: " + dealer);
					dealer = rand.nextInt(1,11);
					System.out.println("Dealer Totoal: " + newDealer);
				  System.out.println("\nDealer wins! Better luck next time!");
				  break;
			  }
			 
			 else if (answer.equals("n") && ( newDealer == newTotal) && newDealer >=17 ) {
				  
				  
				 System.out.println("\nDealer Draws: " + dealer);
					dealer = rand.nextInt(1,11);
					System.out.println("Dealer Totoal: " + newDealer);
				  System.out.println("\nThe Game is a draw! PUSH");
				  break;
			  }
			 
			 
			 
			 
			 else if (answer.equals("n") && ( newDealer >= 17)) {
				  
				  
				 System.out.println("\nDealer Draws: " + dealer);
					dealer = rand.nextInt(1,11);
					System.out.println("Dealer Totoal: " + newDealer);
				  System.out.println("\nYou Beat the Dealer! Winner");
				  break;
				  
			  }
			  
			  
				}   
			  
		
			 }
		
		
		}
			contin = "null";
			answer = "null";
			System.out.println("\nPlay again? (y/n): ");
			playing = scnr.nextLine().trim().equalsIgnoreCase("y");
			l = rand.nextInt(1, 11);
			f = rand.nextInt(1, 11);
			s = rand.nextInt(1, 11);
			total = f + s;
			newTotal = total + l;
			
			
		}
		
		
		
		System.out.println("Game Ended!");

		scnr.close();

	}

}