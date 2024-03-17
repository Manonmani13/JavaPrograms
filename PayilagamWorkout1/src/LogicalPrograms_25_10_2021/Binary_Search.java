package LogicalPrograms_25_10_2021;

public class Binary_Search {
public static void main(String[] args) {
	int []a= {10,20,30,40,50,60,70,80,90,100};
	int key=20;
	int s=0,e=a.length-1;
	while(s<=e)
	{
		int mid=(s+e)/2;
		if(a[mid]==key)
		{
			System.out.println("present");
			//break;
		}
		else if(key>a[mid])
		{
			s=mid+1;
		}
		else
		{
			e=mid-1;
		}
	}
	if(s>e)
	{
		System.out.println("no is not found");
	}
}
}
/*
 no is not found
 */
