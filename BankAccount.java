
class BankAccount {
	public double balance; // Amount of money in the account
	public String name; // Account owner's name

	public BankAccount(String n, double b) {
		balance = b;
		name = n;
	}
	public void deposit(double cash) {
		balance += cash;
	}
	public void withdraw(double cash) {
		balance -= cash;
	}
}
