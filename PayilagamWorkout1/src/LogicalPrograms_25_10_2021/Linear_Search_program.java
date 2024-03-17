package LogicalPrograms_25_10_2021;

public class Linear_Search_program {
public static void main(String[] args) {
	int[] ar = {10,20,5,8,25}; 
	int no = 5; 
	for(int i=0;i<ar.length;i++)
	{
	if(no==ar[i])
	{
	System.out.print("Found number ");
	break;
	}
	/*else
	{
		System.out.println("There is no number ");
		break;
	}*/
	} 
}
}
/*
There is no number 
Found number
*/