import java.util.Scanner;

public class BankAccountDriver {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		final char MAKE_DEPOSIT = 'd';
		final char MAKE_WITHDRAWAL = 'w';
		final char CHECK_BALANCE = 'b';
		final char ADD_INTEREST = 'i';
		final char QUIT = 'q';

		System.out.print("Enter Account Owner: ");
		String owner = scan.nextLine();
		System.out.print("Enter Account ID: ");
		String id = scan.nextLine();
		System.out.print("Enter Account Balance: ");
		double balance = Double.parseDouble(scan.nextLine());
		System.out.print("Enter Interest Rate: ");
		double interest = Double.parseDouble(scan.nextLine());

		BankAccount account = new BankAccount(owner, id, balance, interest);

		menu();
		String userChoice = scan.next();
		char choice = userChoice.toLowerCase().charAt(0);

		while (choice != 'q') {
			if (choice == MAKE_DEPOSIT) {
				System.out.println("Enter amount to deposit: ");
				double amountDeposit = scan.nextDouble();
				account.Deposit(amountDeposit);
				menu();
				userChoice = scan.next();
				choice = userChoice.toLowerCase().charAt(0);
			} else if (choice == MAKE_WITHDRAWAL) {
				System.out.print("Enter amount to withdraw: ");
				double amountWithdraw = scan.nextDouble();
				account.Withdraw(amountWithdraw);
				menu();
				userChoice = scan.next();
				choice = userChoice.toLowerCase().charAt(0);
			} else if (choice == CHECK_BALANCE) {
				System.out.println(account.toString());
				menu();
				userChoice = scan.next();
				choice = userChoice.toLowerCase().charAt(0);
			} else if (choice == ADD_INTEREST) {
				account.Interest(interest);
				menu();
				userChoice = scan.next();
				choice = userChoice.toLowerCase().charAt(0);
			} else {
				System.out.println("Invalid input");
				menu();
				userChoice = scan.next();
				choice = userChoice.toLowerCase().charAt(0);
			}
			if (choice == QUIT) {
				System.out.print("Goodbye");
			}
		}
	}

	public static void menu() {
		System.out.println("Enter 'd' to make a deposit.");
		System.out.println("Enter 'w' to make a withdrawal.");
		System.out.println("Enter 'b' to check the balance.");
		System.out.println("Enter 'i' to add interest.");
		System.out.println("Enter 'q' to quit.");
	}
}
