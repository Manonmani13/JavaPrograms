package Array_27_10_21;

import java.util.Scanner;

public class Right_Cross_Array {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter row no");
	int r=sc.nextInt();
	System.out.println("Enter column no");
	int c=sc.nextInt();
	int a[][]=new int[r][c];
	 for(int i=0;i<a.length;i++)
	 {
		 for(int j=0;j<a[i].length;j++)
		 {
			a[i][j]=sc.nextInt(); 
		 }
	 }

	 int sum=0,lsum=0;
	 for(int i=0;i<a.length;i++)
	 {
		 for(int j=0;j<a[i].length;j++)
		 {if (i==j)
	          lsum = lsum + a[i][j];
         
	        else if ((i+j)==(c-1))
	         sum = sum + a[i][j];
	         
	        //else
	          //continue;
			
		 }
		 System.out.println(sum);
	 }
}
}
/*
Enter row no
2
Enter column no
2
10 34
1  23
34
35

*/