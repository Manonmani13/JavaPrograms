package Oct_17_10_2021;

public class ToStringOverride {
	int rollno;  
	 String name;  
	 String city;  
	  
	 public ToStringOverride(int rollno, String name, String city){  
	 this.rollno=rollno;  
	 this.name=name;  
	 this.city=city;  
	 }  
	   
	 public String toString(){//overriding the toString() method  
	  return rollno+" "+name+" "+city;  
	 }  
	 public static void main(String args[]){  
	   ToStringOverride s1=new ToStringOverride(101,"Raj","lucknow");  
	   ToStringOverride s2=new ToStringOverride(102,"Vijay","ghaziabad");  
	     
	   System.out.println(s1);//compiler writes here s1.toString()  
	   //System.out.println(s2);//compiler writes here s2.toString()  
	 } 
}
