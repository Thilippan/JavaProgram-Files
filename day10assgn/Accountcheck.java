package day10assgn;

public class Accountcheck {
	
	       int accNo;

	       String name,type;

	      
	       Accountcheck(){

	       }

	       Accountcheck(int num,String name,String type){

	              this.accNo = num;

	              this.name = name;

	              this.type = type;

	       }

	      

	      

	       @Override

	       public String toString() {

	       String data = "AccNo : "+accNo+"\nName : "+name+"\nType : "+type;

	       return data;

	       }

	      

	       @Override

	       public boolean equals(Object obj) {

	    	   Accountcheck other = (Accountcheck)obj;

	              if(this.accNo == other.accNo)

	                     return true;

	              else

	                     return false;

	       }

	      

	       public static void main(String[] args) {
	              // TODO Auto-generated method stub

	 

	    	   Accountcheck acc1 = new Accountcheck(001,"Ajay","S/B");

	    	   Accountcheck acc2= new Accountcheck(002,"Udhay","C/A");

	              System.out.println(acc1);

	              System.out.println(acc2);

	                    

	              if(acc1.equals(acc2))

	                     System.out.println("Both have same details");

	              else

	                     System.out.println("Both have different details");

	       }

	      
}
