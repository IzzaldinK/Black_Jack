import java.util.Scanner;
import java.util.Random;

public class BlackJack_Main {
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
		
		f = rand.nextInt(1, 10);
		s = rand.nextInt(1, 10);
		l = rand.nextInt(1, 10);

		total = f + s;
		newTotal = total + l;

		while(playing) {
		
		System.out.println("First cards: " + f + ", " + s);
		System.out.println("Total: " + total);

		
		
		while (!answer.equals("n") && !answer.equals("N")) {

			System.out.println("Do you want to continue? (y/n): ");
			answer = scnr.nextLine();

			if ((answer.equals("y") || answer.equals("Y")) && newTotal < 21) {
				System.out.println("Card: " + l);
				l = rand.nextInt(1, 10);
				System.out.println("Total: " + newTotal);
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
			}
			
			System.out.println("Play again? (y/n): ");
			playing = scnr.nextLine().trim().equalsIgnoreCase("y");
			
		}
		
		
		System.out.println("Game Ended!");

		scnr.close();

	}

}
