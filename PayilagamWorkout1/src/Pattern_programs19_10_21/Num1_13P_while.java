package Pattern_programs19_10_21;

public class Num1_13P_while {
	public static void main(String[] args) {
		int i=1;
		int row=1;
		while(row<=3)
		{
			int col=1;
			while(col<=row)
			{
				System.out.print(i+" ");
				i+=3;
				col++;
			}
			row++;
			System.out.println();
		}
	}
}
