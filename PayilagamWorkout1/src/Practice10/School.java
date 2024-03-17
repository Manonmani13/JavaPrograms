package Practice10;

public class School {
static String name;
static int rollno;
public School(String name,int rollno) {
	this.name=name;
	this.rollno=rollno;
	System.out.println("hi How are you");
}
public static void main(String[] args) {
	School ns=new School("mano", 11);
	ns.study();
	ns.play();
}
 void study() {
	System.out.println("Studing");	
}
 void play() {
	System.out.println("Playing");	
}
}
