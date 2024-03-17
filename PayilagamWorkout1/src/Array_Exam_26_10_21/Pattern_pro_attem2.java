package Array_Exam_26_10_21;

public class Pattern_pro_attem2 {
public static void main(String[] args) {
int x,n=5;
for(int i=1;i<=5;i++)
{
	x=n-i+1;
	for(int j=1;j<=5;j++)
	{
		System.out.print(x+" ");
		x=x+n;
	}
	System.out.println();
}
}
}
/*
5 10 15 20 25 
4 9 14 19 24 
3 8 13 18 23 
2 7 12 17 22 
1 6 11 16 21 
*/