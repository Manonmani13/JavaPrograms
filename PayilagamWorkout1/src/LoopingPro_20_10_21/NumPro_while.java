package LoopingPro_20_10_21;

public class NumPro_while {
	public static void main(String[] args) {
		int row=5;
		while(row>=1)
		{
			int col=1;
			while(col<=row)
			{
				System.out.print(col);
				col++;
			}
			row--;
			System.out.println();
		}
	}
}
