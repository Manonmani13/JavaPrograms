package LoopingPro_20_10_21;

public class ProRow_while {
	public static void main(String[] args) {
		int row=1;
		while(row<=5)
		{
			int col=1;
			while(col<=row)
			{
				System.out.print(col);
				col++;
			}
			
			System.out.println();
			row++;
		}
	}
}
