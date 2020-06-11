package day13assignment;

import java.util.*;


public class CustomerManager {

	//Customer[] customers;
	ArrayList<Customer> customers;
	Scanner scanner;
	//int numberOfCustomers;
	
	CustomerManager(){
		scanner = new Scanner(System.in);
		customers = new ArrayList<Customer>();
	}		
		
	public void addCustomer() {
		Customer customer = new Customer();
		customer.getCustomerDetails();
		customers.add(customer);
			}
			
	public void addCustomers() {
		String choice = "No";
		do {
			addCustomer();
			System.out.println("Do you want to add more Customers? Enter Yes for next entry and No for quiting");
			choice = scanner.nextLine();
		} while (!choice.toLowerCase().equals("no"));
		System.out.println("Customers added");
		System.out.println("--------------------");
	}
	Customer findCustomerIndex(int id)
	{
			for (Customer customer : customers) {
			if (customer !=null)
				{
				if(customer.getId()==id)
				{
				return customer;
				}
			
				}
			
				}
		return null;
	}
	
	public void compareCustomers() {
		int id1=0,id2=0;
		Customer c1,c2;
		System.out.println("Please enter the first customer id to be compared");
		id1 = scanner.nextInt();
		c1 = findCustomerIndex(id1);
		if(c1==null)
		{
			System.out.println("No such customer please try again from start");
			compareCustomers();
		}
		System.out.println("Please enter the second customer id to be compared");
		id2 = scanner.nextInt();
		c2 = findCustomerIndex(id2);
		if(c2==null)
		{
			System.out.println("No such customer please try again from start");
			compareCustomers();
		}
		if(c1.equals(c2))
			System.out.println("The Customers are just the same");
		else
			System.out.println("Not same");
		System.out.println("--------------------");
	}
	
	public void deleteCustomer() {
		int id1=0;
		System.out.println("Please enter the customer id to be deleted");
		id1 = scanner.nextInt();
		Customer c1 = findCustomerIndex(id1);
		if(c1==null)
		{
			System.out.println("No such customer");
			System.out.println("No customer deleted");
		}
		else	
		{
			System.out.println("The customer to be deleted is ");
			System.out.println(c1);
			customers.remove(c1);
			System.out.println("Customer deleted");
			System.out.println("--------------------");
		}
	}
	public void printCustomer() {
		int id1=0;
		System.out.println("Please enter the customer id to be printed");
		id1 = scanner.nextInt();
		Customer c1 = findCustomerIndex(id1);
		System.out.println("The selected Customer details");
		if(c1==null)
		{
			System.out.println("No such customer");
		}
		else
			System.out.println(c1);
		System.out.println("--------------------");
	}
	
	public void printAllCustomer() {
		for (Customer customer : customers) {
			System.out.println(customer);
			System.out.println("--------------------");
		}
	}
	public void updateCustomerDetails() {
		int id1=0;
	
		System.out.println("Please enter the customer id to be updated");
		id1 = scanner.nextInt();
		Customer c1 = findCustomerIndex(id1);
		System.out.println("The customer details for updation");
		if(c1==null)
		{
			System.out.println("No such customer");
		}
		else
		{
			System.out.println(c1);
			System.out.println("--------------------");
			scanner.nextLine();
			System.out.println("Please enter the customer name for updation");
			String name = scanner.nextLine();
			scanner.nextLine();
			System.out.println("Please enter the customer age for updation");
			int age = scanner.nextInt();
		    c1.setName(name);
		   	c1.setAge(age);
		   	System.out.println("Update success");
			System.out.println("The updated customer details");
			System.out.println(c1);
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
				
				addCustomer();				
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
			
			CustomerManager cusmgr = new CustomerManager();
			cusmgr.addCustomers();
			cusmgr.printMenu();

		}

	}


}