package day14Assingment;


public class SavingsAccount extends Account {
	
	
	
	@Override
	boolean transact(Account another,String type,double amount) {
		if(type.equalsIgnoreCase("1"))
		{
			if((another.checkBalance()-amount)>5000.00) {
				another.setBalance(another.checkBalance()-amount);
				System.out.println("Withdrawal successfull.\n Available balance is "+another.checkBalance());
			}
			else{
				System.out.println("Insufficient Balance");
				System.out.println("Please Enter Correct Amount");
			}
		}
		else if(type.equalsIgnoreCase("2"))
		{
			another.setBalance(amount+another.checkBalance());
			System.out.println("Amount Deposited..\n Available balance :"+another.checkBalance());
		}else
			System.out.println("Incorrect choice");
		
			return true;
			
	}
	
}