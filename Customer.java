package bank;
import java.util.Scanner;

//POJO
public class Customer {

	private String id,name,phone;
	private int account;

	Scanner scanner;
	
	
	Customer(){
	scanner =new Scanner(System.in);
	}

	Customer(String id,String name,String phone){
	scanner =new Scanner(System.in);
	this.id = id;
	this.name = name;
	this.phone = phone;
	}

	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public int getAccount() {
		return account;
	}


	public void setAccount(int account) {
		this.account = account;
	}
	
	void getCustomerDetails() {
		System.out.println("Please enter the customer id");
		id = scanner.nextLine();
		System.out.println("Please enter the cd name");
		name = scanner.nextLine();
	}
	
}

