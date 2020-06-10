package day11assignment;
import java.util.Scanner;


public class CustomerMang {

	Customer[] customers;
	Scanner scanner;
	int numberOfCustomers;
	
	CustomerMang(){
		scanner = new Scanner(System.in);
		customers = new Customer[10];
	}
	
	public void addCustomer(int idx) {
		if(idx<10) {
		customers[idx] = new Customer();
		customers[idx].getCustomerDetails();
		
		}
		else
			System.out.println("Cannot add customer. Array is full");
	}
	
	public void addCustomers() {
		int index = -1;
		String choice = "No";
		do {
			index++;
			addCustomer(index);
			System.out.println("Do you want to add more Customers? Enter Yes for next entry and No for quiting");
			choice = scanner.nextLine();
		} while (!choice.toLowerCase().equals("no") && index<10);
		numberOfCustomers = index;
		System.out.println("Customers added");
		System.out.println("--------------------");
	}
	int findCustomerIndex(int id)
	{
		int index = -1;
		for (int i = 0; i <= numberOfCustomers; i++) {
			if(customers[i].getId()==id)
			{
				index = i;
				break;
			}
		}
		return index;
	}
	
	public void compareCustomers() {
		int id1=0,id2=0,idx1,idx2;
		System.out.println("Please enter the first customer id to be compared");
		id1 = scanner.nextInt();
		idx1 = findCustomerIndex(id1);
		if(idx1==-1)
		{
			System.out.println("No such customer please try again from start");
			compareCustomers();
		}
		System.out.println("Please enter the second customer id to be compared");
		id2 = scanner.nextInt();
		idx2 = findCustomerIndex(id2);
		if(idx2==-1)
		{
			System.out.println("No such customer please try again from start");
			compareCustomers();
		}
		if(customers[idx1].equals(customers[idx2]))
			System.out.println("The Customers are just the same");
		else
			System.out.println("Not same");
		System.out.println("--------------------");
	}
	
	public void deleteCustomer() {
		int id1=0,idx1 =0;
		System.out.println("Please enter the customer id to be deleted");
		id1 = scanner.nextInt();
		idx1 = findCustomerIndex(id1);
		if(idx1==-1)
		{
			System.out.println("No such customer");
			System.out.println("No customer deleted");
		}
		else	
		{
			System.out.println("The customer to be deleted is ");
			System.out.println(customers[idx1]);
			customers[idx1] = null;
			System.out.println("Customer deleted");
			System.out.println("--------------------");
		}
	}
	public void printCustomer() {
		int id1=0,idx1 =0;
		System.out.println("Please enter the customer id to be printed");
		id1 = scanner.nextInt();
		idx1 = findCustomerIndex(id1);
		System.out.println("The selected Customer details");
		if(idx1==-1)
		{
			System.out.println("No such customer");
		}
		else
			System.out.println(customers[idx1]);
		System.out.println("--------------------");
	}
	
	public void printAllCustomer() {
		for (int i = 0; i <= numberOfCustomers; i++) {
			System.out.println(customers[i]);
			System.out.println("--------------------");
		}
	}
	public void updateCustomerDetails() {
		int id1=0,idx1 =0;
		System.out.println("Please enter the customer id to be updated");
		id1 = scanner.nextInt();
		idx1 = findCustomerIndex(id1);
		System.out.println("The customer details for updation");
		if(idx1==-1)
		{
			System.out.println("No such customer");
		}
		else
		{
			System.out.println(customers[idx1]);
			System.out.println("--------------------");
			String name = scanner.nextLine();
			System.out.println("Please enter the customer name for updation");
			scanner.nextLine();
			System.out.println("Please enter the customer age for updation");
			int age = scanner.nextInt();
		    scanner.nextLine();
			customers[idx1].setName(name);
			customers[idx1].setAge(age);
			System.out.println("Update success");
			System.out.println("The updated customer details");
			System.out.println(customers[idx1]);
			System.out.println("--------------------");
			
		}
	}
	void printMenu() {
		int userChoice = 0;
		do {
			System.out.println("--------------------");
			System.out.println("1. Adding a new customer");
			System.out.println("2. Updating the customer details");
			System.out.println("3. Deleting a customer");
			System.out.println("4. Printing all the customer details");
			System.out.println("5. Printing the given customer detail");
			System.out.println("6. Compare customer");
			System.out.println("7. Exit");
			System.out.println("--------------------");
			userChoice  = scanner.nextInt();
			switch (userChoice ) {
			case 1:
				numberOfCustomers++;
				addCustomer(numberOfCustomers);				
				break;
			case 2:
				updateCustomerDetails();
				break;
			case 3:
				deleteCustomer();
				break;
			case 4:
				printAllCustomer();
				break;
			case 5:
				printCustomer();
				break;
			case 6:
				compareCustomers();
				break;
			case 7:
				System.out.println("exit.....");
				break;
			default:
				System.out.println("Invalid Entry.. Try again");
				break;
			}
			
		} while (userChoice!=7);
		
	}
	
	public static void main(String[] args) {
		{
			
			CustomerMang cman = new CustomerMang();
			cman.addCustomers();
			cman.printMenu();

		}

	}


}