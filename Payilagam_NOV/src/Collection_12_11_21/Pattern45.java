package Collection_12_11_21;

public class Pattern45 {
public static void main(String[] args) {
	int k=1;
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(k+" ");
			k=k+2;
		}
		System.out.println();
	}
}
}
/*
1 
3 5 
7 9 11 
13 15 17 19 
21 23 25 27 29 
*/