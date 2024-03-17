package LoopingPro_20_10_21;

public class CenterStar_do_while {
	public static void main(String[] args) {
		
	
	int row=1;
	do
	{
		int col=1;
		while(col<=row)
		{
			System.out.print(" "+" ");
			col++;
		}
		int col1=1;
		do
		{
		System.out.print(" "+"*");
		col1++;
		}while(col1<=6-row);
		System.out.println();
		row++;
	}while(row<=5);
}

}
