package Pattern_programs19_10_21;

public class Num1_3_5_do_while {
	/*
	 * 1
	 * 3 6
	 * 7 10 13
	 */
	public static void main(String[] args) {
		int o=0;
		int i=1;
		do
		{
			int j=1;
		
			do
			{
				System.out.print(j+o+" ");
				o+=2;
				j++;
			}while(j<=i);
			i++;
			System.out.println();
		}while(i<=3);
}
}
