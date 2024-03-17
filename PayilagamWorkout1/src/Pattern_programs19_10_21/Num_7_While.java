package Pattern_programs19_10_21;

public class Num_7_While {
	public static void main(String[] args) {
		int end=1;
		int row=1;
		while(row<=5)
		{
			int col=row;
			while(col<=end)
			{
			System.out.print(col);
			col++;
			}
			System.out.println();
			end+=2;
			row++;
		}
	}
}
