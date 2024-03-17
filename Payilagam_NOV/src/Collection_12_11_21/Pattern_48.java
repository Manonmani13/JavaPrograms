package Collection_12_11_21;

public class Pattern_48 {
public static void main(String[] args) {
	int x=1,n=5;
	int y;
	int t;
	for(int i=5;i>=1;i--)//5>1 4>1 3>=1
	{
		y=i;//5 4 3
		t=x;//1 6 10
		for(int j=5;j>=i;j--)//5>=5 5>=4 4>=4 5>=3 4>=3
		{
		System.out.print(t+" ");//1 6 2 10 7 3
		t=t-y;//-4  2 -2 7 3
		y++;//6  7 8 9 10
		}
		x=x+i;//6 10
		System.out.println();
	}
}
}
/*
1 
6 2 
10 7 3 
13 11 8 4 
15 14 12 9 5 

*/