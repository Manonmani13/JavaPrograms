package Pattern_programs19_10_21;

public class Num1_13P_Do_While {
	public static void main(String[] args) {
		int i=1;
		int row=1;
		do
		{
			int col=1;
			do
			{
				System.out.print(i+" ");
				i+=3;
				col++;
			}while(col<=row);
			row++;
			System.out.println();
		}while(row<=3);
	}
}
