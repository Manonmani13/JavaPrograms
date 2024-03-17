package Pattern_programs19_10_21;

public class Num_1_13_while {
public static void main(String[] args) {
	int row=1;
	int j=1;
	while(row<=3)
	{
		int col=1;
	
		while(col<=row)
		{
			System.out.print(j+" ");
			
			col++;
			j+=2;
		}
		System.out.println();
		row++;
	}
}
}
