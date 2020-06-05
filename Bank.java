package bank;
import java.util.Scanner;


public class Bank {

	Account[] accounts;//array of our own type
//	int N;
//	Scanner scanner;
    Bank(){
	 
	   accounts = new Account[5];
//	   scanner = new Scanner(System.in);
	   //will create an array of reff
	}
   
   void addAccount() {
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account();//creating an object for every ref using the iteration
			accounts[i].getAccountDetailsFromUser();
		}
	}
	
	void printDetails() {
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].printAccountDetails();
		}
	}
	
//	void createAccount() {
//		for (int i = 0; i < N; i++) {
//			accounts[i] = new Account();//creating an object for every ref using the iteration
//			accounts[i].getNumberOfAccounts();
//		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank bank = new Bank();
	
		bank.addAccount();
		bank.printDetails();

	}

}
