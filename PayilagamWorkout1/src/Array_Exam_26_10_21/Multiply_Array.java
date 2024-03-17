package Array_Exam_26_10_21;

public class Multiply_Array {
public static void main(String[] args) {
	int a[][]= {{2,3},{3,4}};
	int b[][]= {{4,3},{5,4}};
	int c[][]=new int[2][2];
	System.out.println(c.length);
	System.out.println(c[0].length);
	for(int i=0;i<c.length;i++)
	{
		for(int j=0;j<c[i].length;j++){
			c[i][j]=a[i][j]*b[i][j];
		}
	}
	for(int i=0;i<c.length;i++)
	{
		for(int j=0;j<c[i].length;j++){
			System.out.print(c[i][j]+" ");
		}
		System.out.println();
	}
}
}
/*
8 9 
15 16 
*/