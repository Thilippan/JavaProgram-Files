package day13assignment;

import java.util.Scanner;

public class Customer {
	private int id,age;
	private String name,phone;
	
	
Scanner scanner;
	
	//default
	Customer(){
		scanner = new Scanner(System.in);
	}
	//overloaded constructors
	Customer(int id,int age,String name,String phone){
		scanner = new Scanner(System.in);
		this.id= id;
		this.name = name;
		this.phone = phone;
		this.age = age;
		}
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	
	
	void getCustomerDetails() {
		System.out.println("Please enter the customer id");
		id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Please enter the customer name");
		name = scanner.nextLine();
		System.out.println("Please enter the customer age");
		age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Please enter the customer phone");
		phone = scanner.nextLine();
		
		
	}
	
	@Override
	public String toString() {
			return "Customer ID "+id+"\nCustomer Name "+name+"\nCustomer age "+age+"\nCustomer phone"+phone;
	}
	
	@Override
	public boolean equals(Object obj) {
	Customer c2 = (Customer)obj;
	Customer c1 = this;
	if(c1.getName().equals(c2.getName()) && c1.getId()==c2.getId())
	
	return true;
	else
	return false;
	}
}