package Pattern_programs19_10_21;

public class Num1_3_5_while {
	public static void main(String[] args) {
		int o=0;
		int i=1;
		while(i<=3)
		{
			int j=1;
		
			while(j<=i)
			{
				System.out.print(j+o+" ");
				o+=2;
				j++;
			}
			i++;
			System.out.println();
		}
}
}