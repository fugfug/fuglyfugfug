import java.util.Scanner;

public class RPSText {

	public static void main(String[] args) {
		RPSGame game = new RPSGame();
		Scanner scan = new Scanner(System.in);
		
		boolean play = true;
		while(play) {	//loop to keep playing
			int computerChoice = game.generateComputerPlay();
			String compChoice = game.convertComputerChoiceToString(computerChoice);
				// displays the computer's choice as a word instead of a number

			System.out.println("Enter: ");
			System.out.println("\t 'r' or 'rock' to play rock " + 
							"\n\t 'p' or 'paper' to play paper" + 
							"\n\t 's' or 'scissors' to play scissors" + 
							"\n\t anything else to quit");
			System.out.print("Your Choice: ");
			String uChoice = scan.nextLine();
			if (uChoice.equalsIgnoreCase("r") || uChoice.equalsIgnoreCase("rock") ||
					uChoice.equalsIgnoreCase("p") || uChoice.equalsIgnoreCase("paper") ||
					uChoice.equalsIgnoreCase("s") || uChoice.equalsIgnoreCase("scissors")) {
				
				System.out.println("You played: " + uChoice);
				System.out.println("Computer played: " + compChoice);

				game.findWinner(uChoice, compChoice);
				System.out.println();
				System.out.print("losses: " + game.getComputerWins());
				System.out.print("\twins: " + game.getUserWins());
				System.out.println("\t\tties: " + game.getTies());
				System.out.println();
			} else {
				// if user input is not rock, paper, scissors, r, p, or s, program ends
				break;
			}
		}
	}
}
