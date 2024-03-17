package Pattern_programs19_10_21;

public class Num1_10_while {
	public static void main(String[] args) {
		int no=1;
		int row=1;
		while(row<=4)
		{
			int col=1;
			while(col<=row)
			{
			System.out.print(no+" ");
			col++;
			no++;
			}
			
			System.out.println();
			row++;
		}
	}
}
