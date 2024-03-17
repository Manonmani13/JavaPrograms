package LogicalPrograms_25_10_2021;

import java.util.Scanner;

public class Linear_Search_Scanner {
	public static void main(String[] args) {
		int[] ar = new int[10]; 
		Scanner sc=new Scanner(System.in);
		int no =sc.nextInt() ; 
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		
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
4
1 
2
3
4
Found number

*/