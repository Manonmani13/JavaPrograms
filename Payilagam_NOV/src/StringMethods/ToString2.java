package StringMethods;

public class ToString2 {
	int rollno;  
	 String name;  
	 String city;  
public ToString2(int rollno, String name, String city) {
		// TODO Auto-generated constructor stub
	this.name=name;
	this.city=city;
	this.rollno=rollno;
	//System.out.println(name+" "+city+" "+rollno);
	}
public String toString(){//overriding the toString() method  
	  return rollno+" "+name+" "+city;  
	 }  
public static void main(String[] args) {
	ToString2 m=new ToString2(11,"mano","chennai");
	ToString2 m1=new ToString2(12,"manonmani","chennai");
	System.out.println(m+" "+m1);
}
}
//11 mano chennai 12 manonmani chennai
