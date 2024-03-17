package Pratice1;

public class Sivakumar implements Actor {
int age;
String car;
Sivakumar(int age,String car){
	this.age=age;
	this.car=car;
	System.out.println(car+" "+age);
}
static String address="coimbatore";

public void act() {
	System.out.println("ACt ");
}
public void dance() {
	System.out.println("Dance");
	
}

public void sing() {
	System.out.println("Sing");
}
public void speaking()
{
System.out.println("Speak 5 language");
}
public static void main(String args[]) {
	Sivakumar s=new Sivakumar(65, "audi car");
	s.act();
	s.dance();
	s.sing();
	s.speaking();
	Actor a=new Sivakumar(99, "honda");
	a.act();
	a.dance();
	a.sing();
}
}
