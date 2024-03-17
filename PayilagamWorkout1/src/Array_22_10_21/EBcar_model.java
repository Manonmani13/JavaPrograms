package Array_22_10_21;

import java.util.Scanner;

public class EBcar_model {
public static void main(String[] args) {
System.out.println("how many month your Reading");	
Scanner n=new Scanner(System.in);
int month=n.nextInt();
int amount[]=new int[20];
int total=0;
int avg=0;
int high=0;
int low=amount[0];
System.out.println("Enter amounts");
for(int i=0;i<month;i++)
{
	amount[i]=n.nextInt();
	total=total+amount[i];
	if(amount[i]>0)
	{
		high=amount[i];
	}
	if(amount[i]<low)
	{
		low=amount[i];
	}
}
avg=total/month;
System.out.println(" Total amount is  : "+total);
System.out.println("Average amount is : "+avg);
System.out.println("Highest amount is : "+high);
System.out.println("Lowest amount is  : "+low);
}
}
/*
how many month your Reading
4
Enter amounts
1000
2000
4000
3000
 Total amount is  : 10000
Average amount is : 2500
Highest amount is : 3000
Lowest amount is  : 0


*/