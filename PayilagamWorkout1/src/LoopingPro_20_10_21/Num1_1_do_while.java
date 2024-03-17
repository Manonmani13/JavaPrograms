package LoopingPro_20_10_21;

public class Num1_1_do_while {
	public static void main(String[] args) {
		
		int row=5;
	do
	{
		
		int col=1;
		do
		{
			System.out.print(col);
			col++;
		}while(col<=row);
		System.out.println("*");
		System.out.println();
		row--;
	}while(row>=1);
	
}
}
