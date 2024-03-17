package Array_Exam_26_10_21;

import java.util.Scanner;

public class Three_dimensioal {
	public static void main(String[] args) {
	int[][][] marks = new int[2][3][2];
	System.out.println(marks.length);
	System.out.println(marks[0].length);
	System.out.println(marks[0][0].length);
	Scanner sc = new Scanner(System.in);

for(int stud = 0; stud<marks.length;stud++)
{
for(int month = 0; month<marks[0].length;month++)
{
	for(int mark = 0; mark<marks[0][month].length;mark++)
	{
		System.out.println("Enter marks");
	marks[stud][month][mark] = sc.nextInt();
	System.out.println(	marks[stud][month][mark]);
	}
}
} 
}
}
/*
2
3
5
Enter marks
45
45
Enter marks
65
65
Enter marks
43
43
Enter marks
34
34
Enter marks
33
33
Enter marks
343
343
Enter marks
343
343
Enter marks
43
43
Enter marks
54
54
Enter marks
65
65
Enter marks
645
645
Enter marks
65
65
Enter marks
66
66
Enter marks
5
5
Enter marks
65
65
Enter marks
66
66
Enter marks
77
77
Enter marks
788
788
Enter marks
66
66
Enter marks
77
77
Enter marks
88
88
Enter marks
88
88
Enter marks
99
99
Enter marks
55
55
Enter marks
45
45
Enter marks
45
45
Enter marks
454
454
Enter marks
34
34
Enter marks
3
3
Enter marks
32
32


*/