package LoopingPro_20_10_21;

public class Num1_5_1_do_while {
	public static void main(String[] args) {
		int i=5;
		do
		{
			int j=1;
			do
			{
				System.out.print(j);
				j++;
			}while(j<=i);
			System.out.println();
			i--;
		}while(i>=1);
	}
}
