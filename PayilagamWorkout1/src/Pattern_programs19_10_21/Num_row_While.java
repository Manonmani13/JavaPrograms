package Pattern_programs19_10_21;

public class Num_row_While {
public static void main(String[] args) {
	int row=1;
	while(row<=4)
	{
		int col=1;
		while(col<=row)
		{
		System.out.print(row);
		col++;
		}
		System.out.println();
		row++;
	}
}
}
