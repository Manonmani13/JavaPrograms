package Array_Exam_26_10_21;

import java.util.Scanner;

public class Student_marks_Scanner {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter how many Student ");
	int stu=s.nextInt();
	System.out.println("Enter how many months");
	int mon=s.nextInt();
	System.out.println("Enter how many marks ");
	int m=s.nextInt();
	int marklist[][][]=new int[stu][mon][m];
	for(int stud = 0; stud<marklist.length;stud++)
	{
	for(int month = 0; month<marklist[0].length;month++)
	{
		System.out.print("Enter marks");
		for(int mark = 0; mark<marklist[0][month].length;mark++)
		{
			
			marklist[stud][month][mark]=s.nextInt();
		
		}
	}
	} 
	for(int stud = 0; stud<marklist.length;stud++)
	{
	for(int month = 0; month<marklist[0].length;month++)
	{
		for(int mark = 0; mark<marklist[0][month].length;mark++)
		{
			System.out.print(	marklist[stud][month][mark]+" ");	
		}
		System.out.println();
	}
	} 

	
}
}
/*
Enter how many Student 
2
Enter how many months
2
Enter how many marks 
3
Enter marks2
1
2
Enter marks3
44
5
Enter marks2
3
1
Enter marks3
4
5
2 1 2 
3 44 5 
2 3 1 
3 4 5 
*/