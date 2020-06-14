package day14Assingment;


	
	import java.util.ArrayList;
	import java.util.Scanner;
	import java.time.format.DateTimeFormatter;
	import java.time.LocalDate;
	import java.time.Period;


	public class BankOperations  {
		ArrayList<Account> accDetails;
		Scanner scanner;
		double amt;
		BankOperations(){
			scanner = new Scanner(System.in);
			accDetails = new ArrayList<Account>();
		}
		
		//Allows user to perform their interested operation
	void userOperation()
	{
		int userChoice = 0;
		String transOpt=null, addChoice=null;
		do {
			System.out.println("Please select a number \r\n" + 
						"1) Transact\r\n" + 
						"2) Print Account Details\r\n" + 
						"3) Show balance");
			userChoice = scanner.nextInt();
			scanner.nextLine();
			if(userChoice==1) {
					System.out.println("Please enter the type of transaction\r\n" + 
							"1) Withdraw\r\n" + 
							"2) Deposit");
					transOpt =scanner.next();
					scanner.nextLine();
			}
			System.out.println("Please enter the account number");
			int accNo=scanner.nextInt();
			scanner.nextLine();
			Account obj = findAccount(accNo);
			if(obj!= null) {
				switch(userChoice) {
					case 1: System.out.println("Please enter the amount");
							amt=scanner.nextDouble();
							scanner.nextLine();
							if(obj.getAccType().equalsIgnoreCase("savings"))
							{
								new SavingsAccount().transact(obj, transOpt, amt);
							}
							else if(obj.getAccType().equalsIgnoreCase("current"))
							{
								new CurrentAccount().transact(obj, transOpt, amt);
							}
							break;
					case 2: 
					
							System.out.println(obj.getAccType()+
							"\r\nAccount Number : "+accNo+
							"\r\nName : "+obj.getName()+
							"\r\nAge : " +obj.getAge()+ 
							"\r\nPhone : "+obj.getPhone()+
							"\r\nBalance : "+obj.getBalance());
							break;
					case 3 : 
							System.out.println("The available balance is "+obj.checkBalance());	
							break;
				}
				System.out.println("Do u want to do another operation??...yes/no");
				 addChoice = scanner.nextLine();
			}
		}while( addChoice.equalsIgnoreCase("yes"));
	}

	int ageCalculation (String dob) {
		int age = 0;
		//direct age calculation 
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			//convert String to LocalDate
			LocalDate localDate = LocalDate.parse(dob, formatter);
		  LocalDate now = LocalDate.now(); //gets localDate
		  Period diff = Period.between(localDate, now); //difference between the dates is calculated
		  age = diff.getYears();
		 return age;
	}

		//adds all accounts created to ArrayList accDetails	
		void CreateAccounts(int accountNumber, String accType, String name, String dob, String phone, double balance, int age)
		{
			Account Acc = new SavingsAccount();
			Acc.setAccountNumber(accountNumber);
			Acc.setAccType(accType);
			Acc.setBalance(balance);
			Acc.setName(name);
			Acc.setDob(dob);
			Acc.setAge(age);
			Acc.setPhone(phone);
			accDetails.add(Acc);
			
		}
		//gets accNo as input and returns the relevant account object
		Account findAccount(int accNo) {
			
			for(Account obj:accDetails){
				if(obj.getAccountNumber() == accNo)
					return obj;
			}
			System.out.println("Account does not exist");
			return null;
		}
		public static void main(String[] a) {
			Account Account = new SavingsAccount();
			Account.takeAccountDetails();

			
			
		}
	

}
