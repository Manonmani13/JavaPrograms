package LoopingPro_20_10_21;

public class Num1_1_while {
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
	System.out.println("*");
	System.out.println();
	row--;
}
}
}