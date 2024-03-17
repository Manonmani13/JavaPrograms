package Array_23_10_2021;

public class Letter_A {
public static void main(String[] args) {
	for(int row=1;row<=7;row++) {
		if(row==1) { 
			System.out.print("  ");
			for(int col=1;col<=3;col++) {
				System.out.print("*"+" ");
			}
		}
		else if(row==7) {
			for(int col=1;col<=5;col++) {
				System.out.print("*"+" ");
			}
		}
		else {
			for(int col=1;col<=5;col++) { 
				if(col==1||col==5) {
					System.out.print("*"+" ");
				}
				else {
					System.out.print("  ");
				}
			}
		}
		System.out.println();
	}
	for(int row=1;row<=3;row++) {
		for(int col=1;col<=5;col++) { 
				if(col==1||col==5) {
					System.out.print("*"+" ");
				}
				else {
					System.out.print("  ");
				}
			}
		
		System.out.println();
	}
}


}
/*
  * * * 
*       * 
*       * 
*       * 
*       * 
*       * 
* * * * * 
*       * 
*       * 
*       * 

*/