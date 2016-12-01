import java.util.Random;

public class RPSGame {

	private int computerWins;
	private int userWins;
	private int ties;

	public final int ROCK = 0;
	public final int PAPER = 1;
	public final int SCISSORS = 2;

	//constructor
	public RPSGame() {
		
	}

	//getters
	public int getComputerWins() {
		return computerWins;
	}

	public int getUserWins() {
		return userWins;
	}

	public int getTies() {
		return ties;
	}

	public int generateComputerPlay() {
		Random generator = new Random();
		int computerMove = generator.nextInt(SCISSORS + 1);
		return computerMove;
	}

	// used in RPSGUI
	public String findWinner(int userMove, int computerMove) {
		String r = "";
		if (userMove == ROCK) {
			if (computerMove == ROCK) {
				ties++;
				r= "It's a Tie!";
			} else if (computerMove == PAPER) {
				computerWins++;
				r= "Paper covers Rock. You Lose!";
			} else if (computerMove == SCISSORS) {
				userWins++;
				r = "Rock smashes Scissors. You Win!";
			}
		} else if (userMove == PAPER) {
			if (computerMove == ROCK) {
				userWins++;
				r = "Paper covers Rock. You Win!";
			} else if (computerMove == PAPER) {
				ties++;
				r = "It's a tie!";
			} else if (computerMove == SCISSORS) {
				computerWins++;
				r = "Scissors cuts Paper. You Lose!";
			}
		} else if (userMove == SCISSORS) {
			if (computerMove == ROCK) {
				computerWins++;
				r = "Rock smashes Scissors. You Lose!";
			} else if (computerMove == PAPER) {
				userWins++;
				r = "Scissors cuts Paper. You Win!";
			} else if (computerMove == SCISSORS) {
				ties++;
				r = "It's a Tie!";
			}
		}
		return r;
	}

	// used in RPSText
	public String convertComputerChoiceToString(int compChoice) {
		String cChoice = "";
		if (compChoice == ROCK)
			cChoice = "rock";
		else if (compChoice == PAPER)
			cChoice = "paper";
		else if (compChoice == SCISSORS)
			cChoice = "scissors";
		return cChoice;
	}

	// used in RPSText
	public void findWinner(String uMove, String cMove) {
		if (uMove.equalsIgnoreCase("rock") || uMove.equalsIgnoreCase("r")) {
			if (cMove.equalsIgnoreCase("rock") || cMove.equalsIgnoreCase("r")) {
				ties++;
				System.out.println("It's a tie!");
			} else if (cMove.equalsIgnoreCase("paper") || cMove.equalsIgnoreCase("p")) {
				computerWins++;
				System.out.println("You lose!");
			} else if (cMove.equalsIgnoreCase("scissors") || cMove.equalsIgnoreCase("s")) {
				userWins++;
				System.out.println("You win!");
			}
		} else if (uMove.equalsIgnoreCase("paper") || uMove.equalsIgnoreCase("p")) {
			if (cMove.equalsIgnoreCase("rock") || cMove.equalsIgnoreCase("r")) {
				userWins++;
				System.out.println("You win!");
			} else if (cMove.equalsIgnoreCase("paper") || cMove.equalsIgnoreCase("p")) {
				ties++;
				System.out.println("It's a tie!");
			} else if (cMove.equalsIgnoreCase("scissors") || cMove.equalsIgnoreCase("s")) {
				computerWins++;
				System.out.println("You lose!");
			}
		} else if (uMove.equalsIgnoreCase("scissors") || uMove.equalsIgnoreCase("s")) {
			if (cMove.equalsIgnoreCase("rock") || cMove.equalsIgnoreCase("r")) {
				computerWins++;
				System.out.println("You lose!");
			} else if (cMove.equalsIgnoreCase("paper") || cMove.equalsIgnoreCase("p")) {
				userWins++;
				System.out.println("You win!");
			} else if (cMove.equalsIgnoreCase("scissors") || cMove.equalsIgnoreCase("s")) {
				ties++;
				System.out.println("It's a tie!");
			}
		}

	}

}
