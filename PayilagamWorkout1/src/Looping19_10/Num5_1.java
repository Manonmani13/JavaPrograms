package Looping19_10;

public class Num5_1 {
public static void main(String[] args) {
	int row;
	for(row=5;row>=1;row--)
	{
		for(int col=5;col>=row;col--)
		{
			System.out.print(col);
		}
		System.out.println();
	}
}
}
