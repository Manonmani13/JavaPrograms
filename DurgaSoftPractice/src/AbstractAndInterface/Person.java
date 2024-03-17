package AbstractAndInterface;

public class Person  extends Student{
int mark;
int age;
Person(String name,int age,int mark,int rollno)
{
	super(name,rollno);
	this.mark=mark;
	this.age=age;
	System.out.println(name+" "+rollno+" "+mark+""+age);
}
public static void main(String args[]) {
	Person p=new Person("jai",11,99,12);
	
}
}
