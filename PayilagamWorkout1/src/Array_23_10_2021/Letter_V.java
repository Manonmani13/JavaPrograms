package Array_23_10_2021;

import java.util.Scanner;

public class Letter_V {
	public static void main(String[] args) {
		/*for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=6;j++)
			{
				if(j==1&&i==1||j==6&&i==1||i==2&&j==2||i==2&&j==5||i==3&&j==3||i==3&&j==4)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}*/
		Scanner cs = new Scanner(System.in);
        System.out.println("Enter the row size:");
        int out, in;
        int row_size = cs.nextInt();
        int print_control_x = 1;
        int print_control_y = row_size * 2 - 1;
        for (out = 1; out <= row_size; out++) {
            for (in = 1; in <= row_size * 2; in++) {
                if (in == print_control_x || in == print_control_y) {
                    System.out.printf("*");
                } else {
                    System.out.printf(" ");
                }
            }
            print_control_x++;
            print_control_y--;
            System.out.println();
        }
	}
}
/*
Enter the row size:
6
*         * 
 *       *  
  *     *   
   *   *    
    * *     
     * 

*/