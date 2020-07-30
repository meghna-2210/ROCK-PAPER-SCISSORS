package rock_paper_scissors;

public class RPS {
	private Player player;
	private Computer computer;
	private int playerScore;
	private int computerScore;
	private int numberOfGames;

	//Default Constructor initializing the instance variables
	public RPS() {
		player = new Player();
		computer = new Computer();
		playerScore = 0;
		computerScore = 0;
		numberOfGames = 0;
	}
	public static void main(String[] args) {

		RPS rps = new RPS();//Initialization occured.
		rps.getplayerName();//Getting user name
		rps.startGame();
	}
	//This function is called recursively till the player wants to play.
	//It is even exited if the user of computer completes the first 5 wins.
	public void startGame() {
		int playerinput = player.getInput();
		Driver.display(player.getName(), playerinput);
		// Get moves
		int computerinput = computer.getInput();
		Driver.display("Computer", computerinput);
		// Compare moves and determine winner
		int compareResult=Driver.compareSelections(playerinput, computerinput);
		switch (compareResult) {
		case 0: // Tie
			System.out.println("Tie!");
			break;
		case 1: // player wins
			System.out.println(player.getName()+ " Beats " + "Computer");
			System.out.println("YOU WON!!!!! ......CONGRATS ");
			playerScore++;
			break;
		case -1: // Computer wins
			System.out.println("Computer" +" Beats "+ player.getName());
			System.out.println("YOU LOST!!!");
			computerScore++;
			break;
		}
		numberOfGames++;
		if(playerScore==5)
		{
			System.out.println(player.getName()+" HAS WON THE GAME.............");
			new RPS();
		}
		if(computerScore==5)
		{
			System.out.println("Computer "+" HAS WON THE GAME............");
			new RPS();
		}
		// Ask the player to play again
		if (player.playAgain()) {
			System.out.println();
			startGame();
		} else {
			printStats();
		}
	}
	//helps to get the users name
	public void getplayerName() {
		player.askName();
	}
	//Prints the result.
	public void printStats()
	{
		System.out.println("Number of games played is "+numberOfGames);
		System.out.println(player.getName()+"'s score "+playerScore);
		System.out.println("Computers score "+computerScore);
	}
	}
