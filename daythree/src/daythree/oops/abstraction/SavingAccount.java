package daythree.oops.abstraction;

public class SavingAccount  extends Account{
	private Integer accountNo;

	/**
	 * 
	 */
	public SavingAccount() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param accountNo
	 */
	public SavingAccount(Integer accountNo) {
		this.accountNo = accountNo;
	}

	public Integer getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(Integer accountNo) {
		this.accountNo = accountNo;
	}

	@Override
	public String toString() {
		return "SavingAccount [accountNo=" + accountNo + "]";
	}

	@Override
	public void accountInfo() {
		System.out.println("I am saving account");
		
	}
	
	
}
