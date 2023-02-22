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

		f = rand.nextInt(1, 10);
		s = rand.nextInt(1, 10);
		l = rand.nextInt(1, 10);

		total = f + s;
		newTotal = total + l;

		System.out.println("First cards: " + f + ", " + s);
		System.out.println("Total: " + total);

		while (!answer.equals("n") && !answer.equals("N")) {

			System.out.println("Do you want to continue: ");
			answer = scnr.nextLine();

			if ((answer.equals("y") || answer.equals("Y")) && newTotal < 21) {
				System.out.println("Card: " + l);
				l = rand.nextInt(1, 10);
				System.out.println("Total: " + newTotal);
				newTotal += l;

			} else if (newTotal >= 21) {
				System.out.println("Card: " + l);
				System.out.println("Total: " + newTotal);
				System.out.println("Busted");
				break;
			}

		}

		System.out.println("Game Ended!");

		scnr.close();

	}

}
