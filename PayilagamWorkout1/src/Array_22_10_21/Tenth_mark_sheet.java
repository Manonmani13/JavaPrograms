package Array_22_10_21;
import java.util.*;
public class Tenth_mark_sheet {
public static void main(String[] args) {
	Scanner n=new Scanner(System.in);
	System.out.println("Enter your name");
	String s=n.nextLine();
	System.out.println("enter your subject");
	int count=n.nextInt();
	int marks[]=new int[count];
	int total=0;
	int high=0;
	int count2=0;
	
	System.out.println("enter marks");
	for(int i=0;i<marks.length;i++)
	{
		marks[i]=n.nextInt();
		total=total+marks[i];
		if(marks[i]>high)
		{
			high=marks[i];
		}
		if(marks[i]>80)
		{
			count2++;
		}
		
	}
	System.out.println("your name "+s+"\n your mark list is");
	System.out.println("total is              : "+total);
	System.out.println("highest score         : "+high);
	System.out.println("count of the numbers  : "+count2);
}
}
