package LogicalPrograms_25_10_2021;

public class Second_Largest_No {
public static void main(String[] args) {
	int n[]= {4,5,7,8,9,10};
	int hi=0,low,sec;
	low=Integer.MIN_VALUE;
	sec=Integer.MIN_VALUE;
	System.out.println(low);
	for(int i=0;i<n.length;i++)
	{
		if(n[i]>hi)
		{
			hi=n[i];
		}
		if(n[i]>low)
		{
			sec=low;
			low=n[i];	
			//System.out.println(low+"\t "+sec+"\t "+  no_of_person);
		}
		else if(n[i]>sec&&n[i]!=low)
		{
			sec=n[i];
		
		}
		
	}
	
	System.out.println(sec);
	System.out.println(low);
	System.out.println(hi);
}
}
/*
-2147483648
9
10
10
*/