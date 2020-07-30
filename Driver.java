package rock_paper_scissors;

public class Driver {
	public static final int ROCK = 1;
	public static final int PAPER = 2;
	public static final int SCISSORS = 3;

	//This function will help to display who selected what
	public static void display(String who, int s) {
		switch (s) {
		case Driver.ROCK:
			System.out.print(who + " selected ROCK  ");
			break;
		case Driver.PAPER:
			System.out.print(who + " selected PAPER  ");
			break;
		case Driver.SCISSORS:
			System.out.print(who + " selected SCISSORS  ");
			break;
		default:
			break;
		}
	}
	//This function contains the actual logic
	//and help to decide who won
	public static int compareSelections(int userSelection, int computerSelection) {
		if(userSelection==computerSelection) 
			return 0;
		switch (userSelection) {
		case ROCK:
			return (computerSelection == SCISSORS ? 1 : -1);

		case PAPER:
			return (computerSelection == ROCK ? 1 : -1);

		case SCISSORS:
			return (computerSelection == PAPER ? 1 : -1);
		}
		return 0;
}
}
