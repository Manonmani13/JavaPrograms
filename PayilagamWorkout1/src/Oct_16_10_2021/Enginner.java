package Oct_16_10_2021;

public class Enginner extends Graduate{
public static void main(String[] args) {
	/*Enginner e=new Enginner();
	e.doProject();
	e.study();
	e.searchjob();
	Student s1=(Student)e;//up casting -widen casting - generalization
	s1.study();*/
	//Student s=new Enginner();
	Student s=new Student();
	s.study();
	//System.out.println(s.age);
	Enginner en=(Enginner)s;//down casting -narrow casting
	System.out.println(en.age);
	en.study();
	en.doProject();
}
public void study()
{
	System.out.println("studying reference");
}
public void doProject()
{
	System.out.println("project");
}
}
