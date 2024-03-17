package Array_Exam_26_10_21;

import java.util.Scanner;

public class Two_mentional_Array {
public static void main(String[] args) {
	int marks[][]=new int[2][3];
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<marks.length;i++)
	{
	int to=0;	
		for(int j=0;j<marks[i].length;j++)
		{
			System.out.println("Enter mark");
			 marks[i][j]=sc.nextInt();
			 to=to+marks[i][j];
			// System.out.print("makrs"+marks[i][j]+" ");
		}
		System.out.println("total"+to);
		
		System.out.println();
	}
	/*for(int i=0;i<marks.length;i++)
	{
		int to=0;
		for(int j=0;j<marks[i].length;j++)
		{
			to=to+marks[i][j];
			// System.out.print("makrs"+marks[i][j]+" ");
		}
		System.out.println("total"+to);
		System.out.println();
	}*/
	
}
}
/*
Enter mark
90
Enter mark
80
Enter mark
98

Enter mark
87
Enter mark
76
Enter mark
98

total268

total261



*/