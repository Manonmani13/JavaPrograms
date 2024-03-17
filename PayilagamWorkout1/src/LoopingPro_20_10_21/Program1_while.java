package LoopingPro_20_10_21;

public class Program1_while {
	public static void main(String[] args) {
		int i=1;
		while(i<=5)
		{
			int j=1;
			while(j<i)
			{
			System.out.print(" ");	
			j++;
			}
			int k=1;
			while(k<6-i)
			{
				//System.out.print("*");
				System.out.print(" "+"*"+" ");
				k++;
			}
			;i++;
			System.out.println();
		}
	}
}
