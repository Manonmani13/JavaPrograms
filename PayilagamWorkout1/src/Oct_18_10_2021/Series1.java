package Oct_18_10_2021;

public class Series1 {
public static void main(String[] args) {
	for(int row=4;row>=1;row--)
	{
		for(int col=1;col<=row;col++)
		{
			System.out.print(col);
		}
		System.out.println();
	}
	System.out.println("while loop");
	int i=5;
	while(i>=1)
	{
		int j=1;
		while(j<=i)
		{
			System.out.print(j);
			j++;
		}
		System.out.println();
		i--;
	}
	
}

}
