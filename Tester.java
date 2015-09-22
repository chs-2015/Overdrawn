/**
 * Author: Brandon B.
 * Date: 9-22-15
 */
import java.util.Scanner;
public class Tester {
    public static void main(String[] args) {
    	double balance;
    	String name;
    	Scanner kbReader = new Scanner(System.in);

    	System.out.print("Please enter the name to whom the account belongs. ");
    	name = kbReader.nextLine();

    	System.out.print("Please enter the amount of the initial deposit. $");
    	balance = kbReader.nextDouble();

        BankAccount myAccount = new BankAccount(name, balance);
        myAccount.deposit(505.22);
        System.out.println(myAccount.balance);
        myAccount.withdraw(100);
        System.out.printf("The %s account balance is, $%.2f%n", myAccount.name, ,myAccount.balance);
    }
}
