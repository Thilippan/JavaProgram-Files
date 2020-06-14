package day14Assingment;


import java.util.ArrayList;
import java.util.Scanner;


public abstract class Account {
	int accountNumber,age;
	String name,phone,dob,accType;
	double balance;
	Scanner scanner;
	BankOperations BOP;
	ArrayList<Integer> accountList;
	//constructor to perform initializations
	Account(){
		scanner = new Scanner(System.in);
		accountList = new ArrayList<Integer>();
		BOP = new BankOperations();
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public String getDob() {
		return dob;
	}

	public double getBalance() {
		return balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public int getAge() {
		return age;
	}

	double checkBalance() {
		
	return balance;	
	}
	
	abstract boolean transact(Account another,String type,double amount);
	
	public String getAccType() {
		return accType;
	}
	//Allows user to give input
	void takeAccountDetails(){
		String userChoice = "no";
		
			do {
		System.out.println("Please Enter Account Type");
		accType = scanner.nextLine();
		System.out.println("Please Enter Account Number");
		accountNumber = scanner.nextInt();
		scanner.nextLine();
		if(accountList.contains(accountNumber)) {
			System.out.println("Account already exists!!");
		}
		else {
			accountList.add(accountNumber);
		System.out.println("please enter name");
		name = scanner.nextLine();
		System.out.println("Please Enter Date of Birth DD/MM/YYYY");
		dob= scanner.nextLine();
		System.out.println("Please Enter Phone Number");
		phone = scanner.nextLine();
		System.out.println("Please Enter the Initial Amount For Deposit");
		balance =scanner.nextFloat();
		scanner.nextLine();
		age = BOP.ageCalculation(dob);
		BOP.CreateAccounts(accountNumber, accType, name, dob, phone, balance, age);
		System.out.println("New Account Created");
		}
		System.out.println("Do You Want to enter another yes/no??");
		userChoice = scanner.nextLine();
		}while( userChoice.equalsIgnoreCase("yes"));
		
			BOP.userOperation();
	}

	
	

	
}
