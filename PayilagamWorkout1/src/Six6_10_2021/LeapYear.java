package Six6_10_2021;

public class LeapYear {
int year=2020;
public void years()
{
	if(((year%4==0)&&(year%100!=0))||(year%400==0))
	{
		System.out.println("Leap Year");
	}
	else
	{
		System.out.println("Common Year");
	}
	
}
public static void main(String[] args) {
LeapYear ly=new LeapYear();
ly.years();
}
}