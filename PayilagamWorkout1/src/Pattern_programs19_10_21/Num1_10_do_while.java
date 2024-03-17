package Pattern_programs19_10_21;

public class Num1_10_do_while {
	public static void main(String[] args) {
		int no=1;
		int row=1;
		do
		{
			int col=1;
		do
			{
			System.out.print(no+" ");
			col++;
			no++;
			}	while(col<=row);
			
			System.out.println();
			row++;
		}while(row<=4);
	}
}
