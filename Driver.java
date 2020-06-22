package day19assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	
	public int driverId;
	String driverName="";
	String driverPhone="";
	boolean busallocated=false;
	Scanner sc;
	ArrayList<Driver> driverList;
	

	public Driver() {
		sc= new Scanner(System.in);
		driverList= new ArrayList<Driver>();
		 
	}
	public int getDriverId() {
		return driverId;
	}
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getDriverPhone() {
		return driverPhone;
	}
	public void setDriverPhone(String driverPhone) {
		this.driverPhone = driverPhone;
	}
	public boolean isBusallocated() {
		return busallocated;
	}
	public void setBusallocated(boolean busallocated) {
		this.busallocated = busallocated;
	}
	
	public void getDetailsFromUser()
	{	
		Transport tr= new Transport();
		pop();
		System.out.println("Please enter driver id");
		driverId=sc.nextInt();
		setDriverId(driverId);
		sc.nextLine();
		System.out.println("Please enter driver name");
		driverName=sc.nextLine();
		setDriverName(driverName);
		System.out.println("Please enter driver phone");
		driverPhone=sc.nextLine();
		setDriverPhone(driverPhone);
		tr.populateDriver(getDriverPhone(), getDriverId(), getDriverName());
		}
	private void pop() {
		Driver driver1= new Driver();
		Transport tr= new Transport();
		driverList= tr.populateDriver(driver1.getDriverPhone(),driver1.getDriverId(),driver1. getDriverName());
		
	}
	@Override
	public String toString() {
		return "Driver [driverId=" + driverId + ", driverName=" + driverName + ", driverPhone=" + driverPhone ;
	}
}