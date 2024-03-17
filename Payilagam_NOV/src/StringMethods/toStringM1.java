package StringMethods;

public class toStringM1 {
	int rollno;  
	 String name;  
	 String city;  
public toStringM1(int rollno, String name, String city) {
		// TODO Auto-generated constructor stub
	this.name=name;
	this.city=city;
	this.rollno=rollno;
	//System.out.println(name+" "+city+" "+rollno);
	}
public static void main(String[] args) {
	toStringM1 m=new toStringM1(11,"mano","chennai");
	toStringM1 m1=new toStringM1(12,"manonmani","chennai");
	System.out.println(m+" "+m1);
}
}
/*
mano chennai 11
manonmani chennai 12

*/