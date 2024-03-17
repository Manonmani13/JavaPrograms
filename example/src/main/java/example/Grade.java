package example;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String val="Java";
		 for(int i=1;i<=8;i++){
	
	            for(int j=0;j<=i;j++){
	            	
	                if(i%2==0)
	                System.out.print("_");
	                else  
            			System.out.print(val.charAt(j));

	                
	                
	             
	            }
	            System.out.println();
	        }
	}

}
