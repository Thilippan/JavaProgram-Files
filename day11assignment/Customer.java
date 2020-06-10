package day11assignment;

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
	
// static String maskString(String phone, int start, int end, char maskChar)
	//		  throws Exception{

      //  if(phone == null || phone.equals(""))
        //    return "";
        
        //if(start < 0)
          //  start = 0;
        
        //if( end > phone.length() )
          //  end = phone.length();
            
        //if(start > end)
         //throw new Exception("End index cannot be greater than start index");
        
        //int maskLength = end - start;
        
        //if(maskLength == 0)
      //      return phone;
        
        //StringBuilder sbMaskString = new StringBuilder(maskLength);
        
        //for(int i = 0; i < maskLength; i++){
          //  sbMaskString.append(maskChar);
        //}
        
        //return phone.substring(0, start) 
          //  + sbMaskString.toString() 
            //+ phone.substring(start + maskLength);
    //}
 

	
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
	if(c1.getName().equals(c2.getName()) && c1.getPhone()==c2.getPhone())
	
	return true;
	else
	return false;
	}
}