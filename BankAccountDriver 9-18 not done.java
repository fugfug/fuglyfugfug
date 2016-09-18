import java.util.Scanner;

public class BankAccountDriver {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int MAKE_DEPOSIT = 1;
		final int MAKE_WITHDRAWAL = 2;
		final int CHECK_BALANCE = 3;
		final int ADD_INTEREST = 4;
		final int QUIT = 5;

		System.out.print("Enter Account Owner: ");
		String owner = scan.nextLine();

		System.out.print("Enter Account ID: ");
		String id = scan.nextLine();

		System.out.print("Enter Account Balance: ");
		double balance = scan.nextDouble();

		System.out.print("Enter Interest Rate: ");
		int rate = scan.nextInt();

		BankAccount account = new BankAccount(owner, id, balance, rate);

		menu();
		int userChoice = scan.nextInt();
		while (userChoice == 1 || userChoice == 2 || userChoice == 3 || userChoice == 4 || userChoice == 5) {
			if (userChoice == MAKE_DEPOSIT) {
				System.out.println("Enter amount to deposit: ");
				int amountDeposit = scan.nextInt();
				account.Deposit(amountDeposit);
				menu();
				userChoice = scan.nextInt();
			} else if (userChoice == MAKE_WITHDRAWAL) {
				System.out.print("Enter amount to withdraw: ");
				int amountWithdraw = scan.nextInt();
				account.Withdraw(amountWithdraw);
				menu();
				userChoice = scan.nextInt();
			} else if (userChoice == CHECK_BALANCE) {
				account.toString();
				menu();
				userChoice = scan.nextInt();
			} else if (userChoice == ADD_INTEREST) {
				account.Interest(rate);
				menu();
				userChoice = scan.nextInt();
			} else if (userChoice == QUIT) {
				System.out.print("Goodbye");
			} else {
				System.out.print("Invalid input.");
			}
		}
	}

	public static void menu() {
		System.out.println("Enter 1 to make a deposit.");
		System.out.println("Enter 2 to make a withdrawal");
		System.out.println("Enter 3 to check the balance");
		System.out.println("Enter 4 to add interest");
		System.out.println("Enter 5 to quit");
	}
}
