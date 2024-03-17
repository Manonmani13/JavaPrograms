package Pattern_programs19_10_21;

public class Num_7_Do_While {
	public static void main(String[] args) {
		int end=1;
		int row=1;
		do
		{
			int col=row;
			do
			{
			System.out.print(col);
			col++;
			}while(col<=end);
			System.out.println();
			end+=2;
			row++;
		}while(row<=5);
	}
}
