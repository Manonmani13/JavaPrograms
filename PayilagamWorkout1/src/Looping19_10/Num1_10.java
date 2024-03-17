package Looping19_10;

public class Num1_10 {
public static void main(String[] args) {
	int no=1;
	for(int row=1;row<=4;row++)
	{
		for(int col=1;col<=row;col++)
		{
		System.out.print(no+" ");
		no++;
		}
		System.out.println();
	}
}
}
