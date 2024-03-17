package Pattern_programs19_10_21;

public class Num5_1_do_while {
	public static void main(String[] args) {
		int row=5;
		do
		{
			int col=5;
			do
			{
				System.out.print(col);
				col--;
			}while(col>=row);
			row--;
			System.out.println();
		}while(row>=1);
	}
}
