package guess;

import static java.lang.System.in;

import java.util.Scanner;

public class GueesingGame {

	public static void main(String[] args) {

		int key = (int) Math.ceil(Math.random() * 100);
		boolean right = false;
		int count = 1;
		int overall = 0;
		int times = 0;
		double avg =0;
		System.out.println("Welcome to the guessing game! Try to guess the number in as few tries as possible!");
		
		while (!right) {
			System.out.println("Make a guess 1 through 100");
			Scanner guess = new Scanner(System.in);
			int gs = guess.nextInt();
			if(key==gs) {
				System.out.println("Congrats you got it right in " + count + " guesses");
				right=true;
				overall+=count;
				times++;
				System.out.println("Would you like to play again? y or n");
				Scanner keyboard = new Scanner(System.in);
				String ans = keyboard.next();
				if(ans.equals("y")) {
					right=false;
					count=1;
					key=(int) Math.ceil(Math.random() * 100);
				}
				if(ans.equals("n")) {
					avg = (overall/times);
					System.out.println("You completed the game " + times + " times, with an average number of guesses of " + avg);
				}
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