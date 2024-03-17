package Practice_24_10_21;

import java.util.Scanner;

public class Nwon_num3 {
	public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int num;
 
        System.out.println("Enter a number");
        num = in.nextInt();
        int sum =0, sqr = num*num;
        while(sqr>0){
            sum += sqr%10;   
            sqr = sqr/10;    
        }
 
        if(sum == num)
            System.out.println("Neon Number");
        else
            System.out.println("Not a Neon Number");
    }
}
