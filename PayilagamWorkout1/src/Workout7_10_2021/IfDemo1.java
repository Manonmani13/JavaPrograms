package Workout7_10_2021;

public class IfDemo1 {
int age=19;
boolean citizen=true;
void condi()
{
	if(age>=18&&citizen==true)
	{
		System.out.println("vote");
	}
	else
	{
		System.out.println("Wait for 18");
	}
}
public static void main(String[] args) {
	IfDemo1 n=new IfDemo1();
	n.condi();
}
}
