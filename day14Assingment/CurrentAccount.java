package day14Assingment;

public class CurrentAccount extends Account {
	//override to perform
		@Override
		boolean transact(Account another,String type,double amount) {
			if(type.equalsIgnoreCase("1"))//withdrawal
			{
				if((another.checkBalance()-amount)>1000.00) {
					another.setBalance(another.checkBalance()-amount);
					System.out.println("Withdrawal successfull.\n Available balance is "+another.checkBalance());
				}
				else{
					System.out.println("Insufficient Balance");
					System.out.println("Please Enter Correct Amount");
				}
			}
			else if(type.equalsIgnoreCase("2"))//deposit
			{
				another.setBalance(amount+another.checkBalance());
				System.out.println("Amount Deposited..\n Available balance is "+another.checkBalance());

			}else
				System.out.println("Incorrect choice");
			
				return true;
				
		}
}
