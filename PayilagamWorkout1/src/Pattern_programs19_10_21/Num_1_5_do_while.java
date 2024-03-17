package Pattern_programs19_10_21;

public class Num_1_5_do_while {
	public static void main(String[] args) {
		int row=1;
		do
		{
			int col=1;
			do
			{
				System.out.print(col);
				col++;
			}while(col<=row);
			row++;
			System.out.println();
		}while(row<=5);
		
	}
}
