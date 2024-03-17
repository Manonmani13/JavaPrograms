package Pattern_programs19_10_21;

public class Num0_3_Do_while {
	public static void main(String[] args) {
		int row=1;
		do
		{
			int col=1;
			do
			{
			System.out.print(row-col);
			col++;
			}while(col<=row);
			System.out.println();
			row++;
		}while(row<=4);
		
	}
}
