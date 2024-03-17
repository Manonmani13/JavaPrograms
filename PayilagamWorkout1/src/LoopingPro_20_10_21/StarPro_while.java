package LoopingPro_20_10_21;

public class StarPro_while {
	public static void main(String[] args) {
		int row=5;
		while(row>=1)
		{
			int col=1;
			while(col<=row)
			{
				System.out.print(" ");
				col++;
			}
			int col1=1;
			while(col1<=6-row)
			{
			System.out.print("*");
			;col1++;
			}
			System.out.println();
			;row--;
		}
	}
}
