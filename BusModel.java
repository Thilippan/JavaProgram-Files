package day19assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class BusModel {
	
	String busNumber="";
	int capacity=0;
	boolean filledStatus=false;
	String source="";
	ArrayList<Driver> driverList;
	
	ArrayList<BusModel> busList;
	Scanner sc;
	public BusModel() {
		sc= new Scanner(System.in);
		driverList= new ArrayList<Driver>();
		busList= new ArrayList<BusModel>();
		
	}
	public String getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public boolean isFilledStatus() {
		return filledStatus;
	}
	public void setFilledStatus(boolean filledStatus) {
		this.filledStatus = filledStatus;
	}
	 		
	
	
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	
	
	
	public void GetBusDetailsFromUser()
	{
		Transport tr= new Transport();
		Driver driver1= new Driver();
		int id;
		busList= tr.populateBus(getBusNumber(),getCapacity(),getSource());
		driverList=pop();
		System.out.println("Select the driver from the below list");
		for(Driver driver:driverList)
		{
			System.out.println("Driver Id"+driver.getDriverId());
		}
		System.out.println("Enter thr driver id");
		id= sc.nextInt();
		sc.nextLine();
		driver1.setDriverId(id);
		System.out.println("Please enter Bus number");
		busNumber=sc.nextLine();
		setBusNumber(busNumber);
		System.out.println("Please enter capacity");
		capacity=sc.nextInt();
		setCapacity(id);
		sc.nextLine();
		System.out.println("Please enter Source");
		source=sc.nextLine();
		setSource(source);
		
	}
	private ArrayList<Driver> pop() {
		Driver driver1= new Driver();
		Transport tr= new Transport();
		return driverList= tr.populateDriver(driver1.getDriverPhone(),driver1.getDriverId(),driver1. getDriverName());
		
	}

}