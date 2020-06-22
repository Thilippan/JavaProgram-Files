package day19assignment;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
	
	Scanner scanner;
	ArrayList<BusModel> buslist = new  ArrayList<BusModel>();
	public Employee() {
		scanner = new Scanner(System.in);
		
	}
	int id;
	String name;
	String dob;
	String email;
	String phone;
	int age;
	int busId;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getBusId() {
		return busId;
	}
	public void setBusId(int busId) {
		this.busId = busId;
	}
	
	public void GetEmployeeDetailsFromUser()
	{
		Transport tr= new Transport();
		System.out.println("Please enter Name");
		name = scanner.nextLine();
		setName(name);
		System.out.println("Please enter id");
		setId(id);
		id = scanner.nextInt();
		 System.out.println("Please enter  Date of Birth DD/MM/YYYY");
	       dob= scanner.nextLine();
	       dob= scanner.nextLine();
	       age=ageCalculation(dob);
	       setAge(age);
	       tr.populateemployee(getName(),getId(),getAge());
//	       System.out.println("Please enter bus id");
//	       busId = scanner.nextInt();
	}
	public void assignBus() {
		System.out.println("Select the Bus from the below list");
		for(BusModel em:buslist)
		{
			System.out.println("Bus number"+em.getBusNumber());
		}
		
	}
	public int ageCalculation(String dob) {
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

}