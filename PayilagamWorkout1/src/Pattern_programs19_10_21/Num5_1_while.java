package Pattern_programs19_10_21;

public class Num5_1_while {
	public static void main(String[] args) {
		int row=5;
		while(row>=1)
		{
			int col=5;
			while(col>=row)
			{
				System.out.print(col);
				col--;
			}
			row--;
			System.out.println();
		}
	}
}
