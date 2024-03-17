package LoopingPro_20_10_21;

public class Num1_1 {
public static void main(String[] args) {
	for(int row=5;row>=1;row--)
	{
		for(int col=1;col<=row;col++)
		{
			System.out.print(col);
		}
		System.out.println("*");
		System.out.println();
	}
}
}
