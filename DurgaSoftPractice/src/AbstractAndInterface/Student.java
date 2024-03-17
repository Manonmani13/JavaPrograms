package AbstractAndInterface;

public class Student {
String name;
int rollno;
Student(String name,int rollno)
{
	this.name=name;
	this.rollno=rollno;
	System.out.println(name+" "+rollno);;
}
public static void main(String args[])
{
	Student s=new Student("mano",12);
}
}
