package day12;

import java.util.Scanner;
interface CustomerManager{
void solveIssues();
void approveLoan();
public static void customermanagerMethod() {
		System.out.println("This is in the customer interface--satatic method");
	}
}
interface EmployeeManager{
	 void conductMeeting();
	 void setTarget();
	 public static void employeemanagerMethod() {
			System.out.println("This is in the employee interface--satatic method");
		}
}

abstract class Employee{
	int id;
	String name,phone,designation;
	float salary;
	Scanner scanner;
	
	{
	scanner = new Scanner(System.in);
	}
	abstract void EmployeeDetails();
}

class Manager extends Employee implements CustomerManager,EmployeeManager {


	@Override
	public void conductMeeting() {
		// TODO Auto-generated method stub
		System.out.println("Weekly Meeting Friday 10:00 AM");
		System.out.println("-------------------------------------");		
		}

	@Override
	public void setTarget() {
		// TODO Auto-generated method stub
		System.out.println("Weekly Target (150)");
		System.out.println("Monthly Target(500 - 600)");
		System.out.println("-------------------------------------");
		}

	@Override
	public void solveIssues() {
		// TODO Auto-generated method stub
		System.out.println("Message For Customers From  MANAGER");
		System.out.println("Dear Customer, Please contact the Branch Immediately for Suspect Transaction Issues");
		System.out.println("-------------------------------------------");
	}

	@Override
	public void approveLoan() {
		// TODO Auto-generated method stub
		System.out.println("Dear customer,Your Loan Approved");
		System.out.println("Please Login Your Net Banking to Know Loan Account Details");
		System.out.println("-------------------------------------------");
		
	}

	@Override
	void EmployeeDetails() {
		// TODO Auto-generated method stub
		System.out.println("EMPLOYEE DESIGNATION ");
		System.out.println("----------------------------------");
		System.out.println("Enter Employee ID");
		id=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Employee NAME");
		name=scanner.nextLine();
		System.out.println("Enter Employee PHONE");
		phone=scanner.nextLine();
		System.out.println("Enter Employee SALARY");
		salary=scanner.nextFloat();
		scanner.nextLine();
		System.out.println("Enter Employee GRADE");
		designation=scanner.nextLine();
		System.out.println("These are the Employee Designation.");
System.out.println("-----------------------------------------");
		
		
		
	}

	}
public class Office{
	public static void main(String[] args) {
		Manager manager = new Manager();
		
	CustomerManager CustomerManagerObject;
		CustomerManagerObject=manager;
		CustomerManagerObject.solveIssues();
		CustomerManagerObject.approveLoan();
		
		EmployeeManager EmployeeManagerObject;
		EmployeeManagerObject=manager;
		manager.EmployeeDetails();
		EmployeeManagerObject.conductMeeting();
		EmployeeManagerObject.setTarget();
	}
}