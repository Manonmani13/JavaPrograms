package Practice6;

public class Chid extends Parentc{
	
	String name;
 Chid()
 {
	 System.out.println("Default constructor of child");
 }
 Chid(String name)
 {
	 super(name);
	 this.name=name;
	 System.out.println("name form child class"+name);
 }
 public static void main(String[] args) {
	Chid c=new Chid("kala");
	
}
}
