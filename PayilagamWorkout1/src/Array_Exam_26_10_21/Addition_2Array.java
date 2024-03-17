package Array_Exam_26_10_21;

public class Addition_2Array {
public static void main(String[] args) {
	int a[][]= {{3,1},{3,4}};
	int b[][]= {{3,5},{4,5}};
	int c[][]=new int[2][2];
	
	for(int i=0;i<c.length;i++)
	{
		for(int j=0;j<c[i].length;j++)
		{
			c[i][j]=a[i][j]+b[i][j];
			//System.out.println(c[i][j]);
		}
			
	}
	System.out.println("REsult ");
	for(int i=0;i<c.length;i++)
	{
		for(int j=0;j<c[i].length;j++)
		{
			//c[i][j]=a[i][j]+b[i][j];
			System.out.print(c[i][j]+" ");
		}
		System.out.println();
			
	}
}
}
/*
REsult 
6 6 
7 9 


*/