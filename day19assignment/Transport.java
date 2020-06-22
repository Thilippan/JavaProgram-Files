package day19assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Transport {

	
			ArrayList<Driver> drivers;
			ArrayList<BusModel> buslist;
			ArrayList<Employee> employees;
			Scanner scanner;
			Driver driver = new Driver();
			
			
			Transport(){
				scanner = new Scanner(System.in);
				drivers = new ArrayList<Driver>();
				buslist = new  ArrayList<BusModel>();
				employees = new ArrayList<Employee>();
			
			}
			
			public ArrayList<Driver> populateDriver(String driverPhone, int driverId, String driverName) {
				Driver driver = new Driver();
				driver.setDriverId(driverId);
				driver.setDriverName(driverName);
				driver.setDriverPhone(driverPhone);
				drivers.add(driver);
				return drivers;
				
				
			}
		
			
			public ArrayList<BusModel> populateBus(String busNumber, int capacity, String source) {
				
				BusModel busModel = new BusModel();
				busModel.setBusNumber(busNumber);
				busModel.setCapacity(capacity);
				busModel.setSource(source);
				buslist.add(busModel);
				return buslist;
				
			}
			
			public void populateemployee(String name, int id, int age) {
				
				Employee em= new Employee();
				em.setAge(age);
				em.setId(id);
				em.setName(name);
				employees.add(em);
			}
			
			void addDriver() {
				
				driver.getDetailsFromUser();
				
				}
			
			public void addBus() {
				BusModel busmodel= new BusModel();
				busmodel.GetBusDetailsFromUser();
				}
			
			public void addEmployee() {
				Employee employee = new Employee();
				employee.GetEmployeeDetailsFromUser();
				employees.add(employee);
				}
					
			public void addDrivers() {
				String choice="";
				do {
					addDriver();
					System.out.println("Do you want to add Driver? Enter Yes for next entry and No for quiting");
					choice = scanner.nextLine();
					choice = scanner.nextLine();
				} while (choice.equalsIgnoreCase("yes"));
				System.out.println("Driver added");
				System.out.println("--------------------");
			}
			Driver findDriverIndex(int driverid)
			{
					for (Driver driver : drivers) {
					if (driver !=null)
						{
						if(driver.getDriverId()==driverid)
						{
						return driver;
						}
					
						}
					
						}
				return null;
			}
			
			BusModel findBusIndex(String busnumber)
			{
					for (BusModel busModel: buslist) {
					if (busModel !=null)
						{
						if(busModel.getBusNumber()==busnumber)
						{
						return busModel;
						}
					
						}
					
						}
				return null;
			}
			
			public void compareDrivers() {
				int id1=0,id2=0;
				Driver d1,d2;
				System.out.println("Please enter the first driver id to be compared");
				id1 = scanner.nextInt();
				d1 = findDriverIndex(id1);
				if(d1==null)
				{
					System.out.println("No such driver please try again from start");
					compareDrivers();
				}
				System.out.println("Please enter the second customer id to be compared");
				id2 = scanner.nextInt();
				d2 = findDriverIndex(id2);
				if(d2==null)
				{
					System.out.println("No such customer please try again from start");
					compareDrivers();
				}
				if(d1.equals(d2))
					System.out.println("The Drivers are just the same");
				else
					System.out.println("Not same");
				System.out.println("--------------------");
			}
			
			public void deleteDriver() {
				int id1=0;
				System.out.println("Please enter the customer id to be deleted");
				id1 = scanner.nextInt();
				Driver d1 = findDriverIndex(id1);
				if(d1==null)
				{
					System.out.println("No such driver");
					System.out.println("No driver deleted");
				}
				else	
				{
					System.out.println("The Driver to be deleted is ");
					System.out.println(d1);
					drivers.remove(d1);
					System.out.println("Driver deleted");
					System.out.println("--------------------");
				}
			}
			public void printDriver() {
				int id1=0;
				System.out.println("Please enter the driver id to be printed");
				id1 = scanner.nextInt();
				Driver d1 = findDriverIndex(id1);
				System.out.println("The selected driver details");
				if(d1==null)
				{
					System.out.println("No such driver");
				}
				else
					System.out.println(id1);
				System.out.println("--------------------");
			}
			
			public void printAllDriver() {
				for (Driver driver : drivers) {
					
				}
			}
			public void updateDriverDetails() {
				int id1=0;
			
				System.out.println("Please enter the driver id to be updated");
				id1 = scanner.nextInt();
				Driver d1 = findDriverIndex(id1);
				System.out.println("The driver details for updation");
				if(d1==null)
				{
					System.out.println("No such driver");
				}
				else
				{
					System.out.println(d1);
					System.out.println("--------------------");
					scanner.nextLine();
					System.out.println("Please enter the driver name for updation");
					String drivername = scanner.nextLine();
					scanner.nextLine();
					d1.setDriverName(drivername);
					System.out.println("Update success");
					System.out.println("The updated customer details");
					System.out.println(d1);
					System.out.println("--------------------");
					
				}
			}
			void printDriverMenu() {
				int userChoice = 0;
				do {
					System.out.println("--------------------");
					System.out.println("1. Add a Driver");
					System.out.println("2. Add a Bus");
					System.out.println("3. Add a Employee");
					System.out.println("4. Edit Driver details");
					System.out.println("5. Edit Bus detail");
					System.out.println("6. Edit Employee details");
					System.out.println("7. Delete Driver");
					System.out.println("8. Delete Bus");
					System.out.println("9. Delete Employee");
					System.out.println("10. Assign Driver for Bus");
					System.out.println("11. Assign Bus for Employee");
					System.out.println("--------------------");
					userChoice  = scanner.nextInt();
					switch (userChoice ) {
					case 1:
						
						addDrivers();				
						break;
					case 2:
						addBuses();
						break;
					case 3:
						addEmployees();
						break;
					case 4:
						updateDriverDetails();
						break;
					case 5:
						updateBusDetails();
						break;
					case 6:
						updateEmployeeDetails();
						break;
					case 7:
						DeleteDriver();
						break;
					case 8:
						DeleteBus();
						break;
					case 9:
						DeleteEmployee();
						break;
					case 10:
						AssignDriverForBus();
						break;
					case 11:
						AssignBusForEmployee();
						break;
					default:
						System.out.println("Invalid Entry.. Try again");
						break;
					}
					
				} while (userChoice!=7);
				
			}
			
			private void AssignBusForEmployee() {
				// TODO Auto-generated method stub
				
			}

			private void AssignDriverForBus() {
				// TODO Auto-generated method stub
				
			}

			private void DeleteEmployee() {
				// TODO Auto-generated method stub
				
			}

			private void DeleteBus() {
				// TODO Auto-generated method stub
				
			}

			private void DeleteDriver() {
				// TODO Auto-generated method stub
				
			}

			private void updateEmployeeDetails() {
				// TODO Auto-generated method stub
				
			}

			private void updateBusDetails() {
				
				
			}

			public void addBuses() {
				String choice = "";
				do {
					addBus();
					System.out.println("Do you want to add busnumber? Enter Yes for next entry and No for quiting");
					choice = scanner.nextLine();
				} while (choice.equalsIgnoreCase("yes"));
				System.out.println("Bus Nuber added");
				System.out.println("--------------------");
		
			}
			
			
			public void deleteBuses() {
				String id2="0";
				System.out.println("Please enter the bus number to be deleted");
				id2 = scanner.nextLine();
				BusModel b1 = findBusIndex(id2);
				if(b1 == null)
				{
					System.out.println("No such busnumber");
					System.out.println("No driver busnumber");
				}
				else	
				{
					System.out.println("The busnumber to be deleted is ");
					System.out.println( b1);
					buslist.remove(b1);
					System.out.println("busnumber deleted");
					System.out.println("--------------------");
				}
			}
			
			public void printBusDetail() {
				String id1=" ";
				System.out.println("Please enter the bus numeber to be printed");
				id1 = scanner.nextLine();
				BusModel b1 = findBusIndex(id1);
				System.out.println("The selected bus number details");
				if(b1==null)
				{
					System.out.println("No such busnumber");
				}
				else
					System.out.println(id1);
				System.out.println("--------------------");
			}
			
			public void printAllBuses() {
				for (BusModel busModel : buslist) {
					System.out.println(busModel);
					System.out.println("--------------------");
				}
			}
			
			void printBusMenu() {
				int userChoice = 0;
				do {
					System.out.println("--------------------");
					System.out.println("1. Adding a new Bus Number");
					System.out.println("2. Deleting a Bus Number");
					System.out.println("3. Printing all the Busnumber details");
					System.out.println("4. Printing the given busnumber detail");
					System.out.println("5. Exit");
					System.out.println("--------------------");
					userChoice  = scanner.nextInt();
					switch (userChoice ) {
					case 1:
						addBuses();				
						break;
					case 2:
						deleteBuses();
						break;
					case 3:
						printAllBuses();
						break;
					case 4:
						printBusDetail();
						
						break;
					case 5:
						System.out.println("exit.....");
						break;
					default:
						System.out.println("Invalid bus number.. Try again");
						break;
					}
					
				} while (userChoice!=5);
				
			}
			
			public void addEmployees() {
				String choice = "";
				do {
					addEmployee();
					System.out.println("Do you want to add Employee? Enter Yes for next entry and No for quiting");
					choice = scanner.nextLine();
					choice = scanner.nextLine();
				} while (choice.equalsIgnoreCase("yes"));
				System.out.println("Employee added");
				System.out.println("--------------------");
			}
			Employee findEmployeeIndex(int id)
			{
					for (Employee employee : employees) {
					if (employee !=null)
						{
						if(employee.getId()==id)
						{
							return employee;
						}
					
						}
					
						}
				return null;
			}
			
			public void deleteEmployees() {
				int id1;
				System.out.println("Please enter the bus number to be deleted");
				id1 = scanner.nextInt();
							Employee e1 = findEmployeeIndex(id1);
				if(e1==null)
				{
					System.out.println("No such Employee");
				
				}
				else	
				{
					System.out.println("The Employee to be deleted is ");
					System.out.println( e1);
					employees.remove(e1);
					System.out.println("Employee deleted");
					System.out.println("--------------------");
				}
			}

			public void printAllEmployees() {
				for (Employee employee : employees) {
					System.out.println(employee);
					System.out.println("--------------------");
				}
			}
			
			void printEmployeeMenu() {
				int userChoice = 0;
				do {
					System.out.println("--------------------");
					System.out.println("1. Adding a Employee ID");
					System.out.println("2. Deleting a Employee ID");
					System.out.println("3. Printing all the Employee details");
					//System.out.println("4. Printing the given Employee detail");
					System.out.println("4. Exit");
					System.out.println("--------------------");
					userChoice  = scanner.nextInt();
					switch (userChoice ) {
					case 1:
						
						addEmployees();				
						break;
					case 2:
						deleteEmployees();
						break;
					case 3:
						printAllEmployees();
					case 4:
						System.out.println("exit.....");
						break;
					default:
						System.out.println("Invalid Employee ID.. Try again");
						break;
					}
					
				} while (userChoice!=4);
				
			}
			

			
			
		public static void main(String[] args) {
			Transport tt = new Transport();
			tt.printDriverMenu();
			tt.addBuses();
			tt.printBusMenu();
			tt.addEmployees();
			tt.printEmployeeMenu();
		}

		
}
		
	
