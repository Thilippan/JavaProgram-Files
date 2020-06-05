package bank;
import java.util.Scanner;

public class Account {

	private String name,number;
	private float balance;
//	private int no;
	
	Scanner scanner;
	
	
	Account(){
		scanner = new Scanner(System.in);
	}
	//overloaded constructors
	Account(String name,float balance){
		scanner = new Scanner(System.in);
		this.name = name;
		this.balance = balance;
	}
	
	Account(String number,String name, float balance)
	{
		scanner = new Scanner(System.in);
		this.number = number;
		this.name = name;
		this.balance = balance;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
//	void getNumberOfAccounts() {
//		System.out.println("Please enter the number of accounts");
//		no = scanner.nextInt();
//	}
	
	void getAccountDetailsFromUser() {
		System.out.println("Please enter the Account number");
		number = scanner.nextLine();
		System.out.println("Please enter the Customer name");
		name = scanner.nextLine();
		System.out.println("Please enter the Account balance");
		balance = scanner.nextFloat();
	}
	void printAccountDetails() {
		System.out.println("Account number "+number);
		System.out.println("Customer name "+name);
		System.out.println("Account balance "+balance);
		System.out.println("------------------------------------");
	}
}
