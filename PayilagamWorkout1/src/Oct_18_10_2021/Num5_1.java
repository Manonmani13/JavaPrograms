package Oct_18_10_2021;

public class Num5_1 {
	public static void main(String[] args) {
		for(int row=1;row<=5;row++)
		{
			for(int col=5;col>=row;col--)
			{
				System.out.print(col);
			}
			System.out.println();
		}
	}
}
