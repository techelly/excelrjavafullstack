package daythree.oops.abstraction;

public class AccountMain {

	public static void main(String[] args) {
		// abstract class cannot be instantiated
		//Account account = new Account();
		Account account;
		SavingAccount savacc = new SavingAccount();
		savacc.getX();
		savacc.accountInfo();
		savacc.accountInfo2();
		
	}

}
