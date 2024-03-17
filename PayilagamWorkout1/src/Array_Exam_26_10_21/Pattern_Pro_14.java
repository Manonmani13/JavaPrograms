package Array_Exam_26_10_21;

public class Pattern_Pro_14 {
public static void main(String[] args) {
	int x,y,n=5;
	for(int i=5;i>=1;i--)
	{
		x=i;
		y=n-i+1;
		for(int j=5;j>=1;j--)
		{
			if(j%2==1)
				System.out.print(x+" ");
			else
				System.out.print(y+" ");
			x=x+n;
			y=y+n;
		}
		System.out.println();
	}
}
}
/*
5 6 15 16 25 
4 7 14 17 24 
3 8 13 18 23 
2 9 12 19 22 
1 10 11 20 21 
*/