package day13assignment;

import java.util.ArrayList;

public class Account{

	ArrayList<String> StringArray;
	ArrayList<Double> DoubleArray;
	
	Account(){
		StringArray = new ArrayList<String>();
		DoubleArray = new ArrayList<Double>();
		
	}
	
	void addMembers() {
		StringArray.add((String)"================");
		StringArray.add((String)"Customer Details");
		StringArray.add((String)"================");
		StringArray.add((String)"Customer Name: ABCD");
		StringArray.add((String)"Account Number: 123456789");
		StringArray.add((String)"Phone Number: 9078675634");
		DoubleArray.add((double)3750.20);
		
		}
	
	void printCollection() {
			
	for (String str :StringArray) {
	
	System.out.println(str);
	}
	for (Double Db : DoubleArray) {
		System.out.println("Balance:" +Db);
		
	}
	}
	
	
		
	public static void main(String[] args) {
		Account Acc = new Account();
		Acc.addMembers();
		Acc.printCollection();
		

	}

}