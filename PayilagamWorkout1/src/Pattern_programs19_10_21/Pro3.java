package Pattern_programs19_10_21;

public class Pro3 {
	
public static void main(String[] args) {
	int row = 1;
	while(row<=5)
	{		
	int col = 1;
	while(col<=row)
	{
		System.out.print(row*col + " ");
		col++;
	}
	System.out.println();
	row++;
	
	} 
}
}
