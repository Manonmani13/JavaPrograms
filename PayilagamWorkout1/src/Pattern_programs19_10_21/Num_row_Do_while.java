package Pattern_programs19_10_21;

public class Num_row_Do_while {
	public static void main(String[] args) {
		int row=1;
		do
		{
			int col=1;
			do
			{
			System.out.print(row);
			col++;
			}while(col<=row);
			System.out.println();
			row++;
		}while(row<=4);
	}
}
