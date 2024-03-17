package Practice9;
class Com
{
void wel()
{
System.out.println("welcome you all");
}
	public void walk()
	{
	System.out.println("lets walk  parent");	
	}
}


public class Singing extends Com{
String name="surya";
int rollno=20;
int age=24;
	
public static void main(String args[])
{
Singing s=new Singing();
Com c=new Singing();

s.wel(13);
s.wel(44,33);
s.walk();
//c.wel();
}
public void wel(int rollno)
{

System.out.println("Welcome from child"+rollno);
}
public void  wel(int rollno,int age)
{
	
	System.out.println(rollno);
	System.out.println(age);
}
public void walk()
{
System.out.println("lets walk from child");
}

}