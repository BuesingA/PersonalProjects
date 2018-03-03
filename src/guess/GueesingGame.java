package guess;

import java.util.Scanner;

public class GueesingGame {

	public static void main(String[] args) {

		int key = (int) Math.ceil(Math.random() * 100);
		boolean right = false;
		int count = 1;
		System.out.println("Welcome to the guessing game! Try to guess the number in as few tries as possible!");
		
		while (!right) {
			System.out.println("Make a guess 1 through 100");
			Scanner guess = new Scanner(System.in);
			int gs = guess.nextInt();
			if(key==gs) {
				System.out.println("Congrats you got it right in " + count + " guesses");
				right=true;
			}
			else if (key>gs) { 
				System.out.println("The answer is greater than " + gs);
				count++;
			}
			else {
				System.out.println("The answer is less than " + gs);
				count++;
			}

		}
	}
}