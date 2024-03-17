package LoopingPro_20_10_21;

public class Program1_d_while {
	public static void main(String[] args) {
		int i=1;
		do
		{
			int j=1;
			do
			{
			System.out.print(" ");	
			j++;
			}while(j<i);
			int k=1;
			do
			{
				//System.out.print("*");
				System.out.print(" "+"*"+" ");
				k++;
			}while(k<6-i);
			;i++;
			System.out.println();
		}while(i<=5);
	}
}
