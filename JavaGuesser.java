import java.util.*;
import java.lang.*;
public class JavaGuesser {
	public static void main(String[] args) {
		new JavaGuesser();
	}

	public JavaGuesser() {
		Scanner input = new Scanner(System.in);
		String select = "";
		boolean keepGoing = true;
		while (keepGoing) {
			System.out.println("0) exit");
			System.out.println("1) Human Guesser");
			System.out.println("2) Computer Guesser");
			System.out.println();
			System.out.print("Please enter 0-2: ");
			select = input.nextLine();
			if (select.equals("0")) {
				keepGoing = false;
			} else if (select.equals("1")) {
				humanGuesser();
			} else if (select.equals("2")) {
				computerGuesser();
			} else {
				System.out.println("invalid input, please try again");
			} // end if
		} // end while
	} // end constructor

	public void humanGuesser() {
		Scanner input = new Scanner(System.in);
		System.out.println("human guesser");
		int number = (int)(Math.random() * 100 + 1);
		int turns = 1;
		String guess = "";
		boolean keepGoing = true;
		while (keepGoing) {
			System.out.print(turns + ") Please enter a number: ");
			guess = input.nextLine();
			try {
				if (Integer.parseInt(guess) == number) {
					keepGoing = false;
					System.out.println("got it!");
				} else if (Integer.parseInt(guess) > number) {
					System.out.println("too high...");
					turns++;
				} else {
					System.out.println("too low...");
					turns++;
				} // end if
			} catch (Exception e) {
				System.out.println("Invalid input, please try again");
			} // end try
		} // end while
		System.out.println();
		if (turns < 7) {
			System.out.println("Very good!");
		} else if (turns == 7) {
			System.out.println("Good, you got the number right in an average amount of turns.");
		} else {
			System.out.println("Can you get the number right with less turns?");
		} // end if
		System.out.println();
	} // end humanGuesser

	public void computerGuesser() {
		Scanner input = new Scanner(System.in);
		System.out.println("computer guesser");
		int guess = 50;
		int guessChange = 25;
		int turns = 1;
		String correct = "";
		boolean keepGoing = true;
		while (keepGoing) {
			System.out.println(turns + ") I guess " + guess);
			System.out.print("Too (H)igh, too (L)ow, or (C)orrect? ");
			correct = input.nextLine();
			if (correct.toUpperCase().equals("C")) {
				keepGoing = false;
			} else if (correct.toUpperCase().equals("L")) {
				guess += guessChange;
				guessChange = (int)Math.floor(guessChange / 2.0);
				turns++;
			} else if (correct.toUpperCase().equals("H")) {
				guess -= guessChange;
				guessChange = (int)Math.floor(guessChange / 2.0);
				turns++;
			} else {
				System.out.println("Invalid input, please try again");
			} // end if
			
			// to prevent the computer from getting stuck on a guess
			if (guessChange == 0) {
				guessChange = 1;
			} // end if
		} // end while
		System.out.println();
	} // end computerGuesser
} // end JavaGuesser

