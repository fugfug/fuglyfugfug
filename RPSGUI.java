
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RPSGUI extends JFrame {

	// number of wins
	private JLabel numUserWins, numCompWins, numTies;

	// buttons
	private JButton rockButton, paperButton, scissorsButton;

	//labels and images that display the user's moves and computer's moves and result
	private JLabel compMove, userMove;
	private JLabel outcome;
	private ImageIcon rockPic, paperPic, scissorsPic;
	
	private int userPlay, computerPlay;

	private RPSGame game;

	private Container contentPane;

	public RPSGUI() {
		super("Rock, Paper, Scissors");

		setSize(350, 300);

		contentPane = getContentPane();
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(Color.WHITE);
		contentPane.add(mainPanel);
		
		game = new RPSGame();
		
		//images
		rockPic = new ImageIcon("rock.jpg");
		paperPic = new ImageIcon("paper.jpg");
		scissorsPic = new ImageIcon("scissors.jpg");
		
		// moves labels and outcome
		compMove = new JLabel("Computer's Move");
		compMove.setVerticalTextPosition(SwingConstants.BOTTOM);
		compMove.setHorizontalTextPosition(SwingConstants.CENTER);
		userMove = new JLabel("Your Move");
		userMove.setVerticalTextPosition(SwingConstants.BOTTOM);
		userMove.setHorizontalTextPosition(SwingConstants.CENTER);
		outcome = new JLabel();
		outcome.setHorizontalTextPosition(SwingConstants.CENTER);
 		outcome.setForeground(Color.blue);

 		// moves labels and outcome panel
		JPanel imageOutcomePanel = new JPanel();
		imageOutcomePanel.setLayout(new BorderLayout());
		imageOutcomePanel.add(compMove, BorderLayout.WEST);
		imageOutcomePanel.add(userMove, BorderLayout.EAST);
		imageOutcomePanel.add(outcome, BorderLayout.SOUTH);
		mainPanel.add(imageOutcomePanel);
		
		// numbers of wins, losses, and ties added to status panel
		// wins, losses, and ties start out as 0
		numCompWins = new JLabel("Computer Wins: " + game.getComputerWins());
		numUserWins = new JLabel("User Wins: " + game.getUserWins());
		numTies = new JLabel("Ties: " + game.getTies());
		JPanel statusPanel = new JPanel();
		statusPanel.add(numCompWins);
		statusPanel.add(numUserWins);
		statusPanel.add(numTies);
		mainPanel.add(statusPanel);
	
		// buttons
		JPanel buttonPanel = new JPanel();
		rockButton = new JButton("Rock");
		rockButton.addActionListener(new buttonListener());
		paperButton = new JButton("Paper");
		paperButton.addActionListener(new buttonListener());
		scissorsButton = new JButton("Scissors");
		scissorsButton.addActionListener(new buttonListener());
		buttonPanel.add(rockButton);
		buttonPanel.add(paperButton);
		buttonPanel.add(scissorsButton);
		buttonPanel.setBackground(Color.WHITE);
		mainPanel.add(buttonPanel);

	}

	private class buttonListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			computerPlay = game.generateComputerPlay();
			compMoveSetIcon(computerPlay);	//displays computer's choice
			
			//user moves
			if (event.getSource() == rockButton) {
				userMove.setIcon(rockPic); 	//displays icon of user's choice
				userPlay = game.ROCK; 		//userPlay = 0 = rock
			} else if (event.getSource() == paperButton) {
				userMove.setIcon(paperPic);
				userPlay = game.PAPER;		//userPlay = 1 = paper
			} else if (event.getSource() == scissorsButton) {
				userMove.setIcon(scissorsPic);
				userPlay = game.SCISSORS;
			}
			
			//results
			outcome.setText(game.findWinner(userPlay, computerPlay));
			numCompWins.setText("Computer Wins: " + game.getComputerWins());
			numUserWins.setText("User Wins: " + game.getUserWins());
			numTies.setText("Ties: " + game.getTies());
		}
		
		private void compMoveSetIcon(int c) {
			// determines, sets, and displays image of the computer's move
			if (c == game.ROCK)		//computer's choice = 0 = rock
				compMove.setIcon(rockPic);
			else if (c == game.PAPER)
				compMove.setIcon(paperPic);
			else if (c == game.SCISSORS)
				compMove.setIcon(scissorsPic);
		}
	}

	public static void main(String args[]) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				RPSGUI frame = new RPSGUI();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});

	}
}