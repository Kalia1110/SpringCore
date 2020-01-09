package kcp.spring.beans;

public class BankCostomer {
    private BankAccount account;
    private String bankName;

    public BankCostomer(BankAccount account, String bankName) {
	
	this.account = account;
	this.bankName = bankName;
    }
    public double getBalance() {
	return account.showBal();
    }

    @Override
    public String toString() {
	return "BankCostomer [account=" + account +
		", bankName=" + bankName + "]";
    }

}
