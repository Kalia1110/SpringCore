package kcp.spring.beans;

public class BankAccount {

    private long acno;
    private String holderName;
    private double balance;
    private boolean netBanking;

    public void setAcno(long acno) {
	this.acno = acno;
    }

    public void setHolderName(String holderName) {
	this.holderName = holderName;
    }

    public void setBalance(double balance) {
	this.balance = balance;
    }

    public void setNetBanking(boolean netBanking) {
	this.netBanking = netBanking;
    }

    @Override
    public String toString() {
	return "BankAccount [acno=" + acno + ", holderName=" + holderName + ", balance=" + balance + ", netBanking="
		+ netBanking + "]";
    }

    public double showBal() {
	return balance;
    }

}
