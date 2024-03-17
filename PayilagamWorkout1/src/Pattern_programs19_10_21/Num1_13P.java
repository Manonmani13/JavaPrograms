package Pattern_programs19_10_21;

public class Num1_13P {
public static void main(String[] args) {
	int i=1;
	for(int row=1;row<=3;row++)
	{
		for(int col=1;col<=row;col++)
		{
			System.out.print(i+" ");
			i+=3;
		}
		System.out.println();
	}
}
}
