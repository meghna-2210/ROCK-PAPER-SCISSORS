package rock_paper_scissors;
import java.util.Scanner;

public class Player {
	private String name;// Represents the Players name
	Scanner sc = new Scanner(System.in);
	// sc will help to take inputs from keyboard

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void askName() {
		System.out.println("Would you mind telling us who's playing ? :)");
		name = sc.next();
	}

	public int getInput() {
		// This function lets the user do the selection among
		// ROCK PAPER SCISSORS
		// and return what has been selected
		System.out.println("Select  ROCK.....PAPER....SCISSOR");

		String input = sc.next();
		input = input.toUpperCase();
		char c = input.charAt(0);
		// checking the 1st character in the input
		if (c == 'R')
			return Driver.ROCK;
		else if (c == 'P')
			return Driver.PAPER;
		else if (c == 'S')
			return Driver.SCISSORS;
		else {
			getInput();
			return 0;
		}
	}

	public boolean playAgain() {
		// This function will ask if the user wants to
		// play again and return true or false accordingly.
		sc=new Scanner(System.in);
		System.out.print("Do you want to play again? ");
		String userInput = sc.nextLine();
		userInput = userInput.toUpperCase();
		return userInput.charAt(0) == 'Y';
	}
}
