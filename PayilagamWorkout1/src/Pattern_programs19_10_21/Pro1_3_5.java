package Pattern_programs19_10_21;

public class Pro1_3_5 {
	/*
	 * 1
	 * 3 5
	 * 7 9 11
	 */
public static void main(String[] args) {
	int o=0;
	for(int i=1;i<=3;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j+o+" ");
			o+=2;
		}
	
		System.out.println();
	}/*
	for(int row=1;row<=1;row++)
	{
		System.out.print(row);
	}
	System.out.println();
	for(int row=3;row<=5;row+=2)
	{
		System.out.print(row);
	}
	System.out.println();
	for(int row=7;row<=11;row+=2)
	{
		System.out.print(row);
	}
	System.out.println();*/
}
}
