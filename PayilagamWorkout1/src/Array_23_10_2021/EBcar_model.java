package Array_23_10_2021;

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
int low=Integer.MAX_VALUE;
System.out.println("Enter amounts");
for(int i=0;i<month;i++)
{
	amount[i]=n.nextInt();
	total=total+amount[i];
	if(amount[i]>high)
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
3
Enter amounts
1000
100
230
 Total amount is  : 2330
Average amount is : 776
Highest amount is : 2000
Lowest amount is  : 100


*/