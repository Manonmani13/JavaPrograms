package LoopingProgram21_10_21;

public class Star_P {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=6-i;j++)
			{
				System.out.print(" ");
			}
			//System.out.print("/  ");
			System.out.print("* ");
			for(int k=1;k<i;k++)
			{
				System.out.print("  ");
			}
			System.out.print("* ") ;
			System.out.println();
		}
	}
}

/*
 	 * * 
    *   * 
   *     * 
  *       * 
 *         * 



*/