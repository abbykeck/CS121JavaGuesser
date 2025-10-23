import java.util.*;
import java.lang.*;
public class JavaGuesser {
	public static void main(String[] args) {
		System.out.println("Hello world!");
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
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} // end try
		} // end while
	} // end humanGuesser

	public void computerGuesser() {
		System.out.println("computer guesser");
	} // end computerGuesser
} // end JavaGuesser

