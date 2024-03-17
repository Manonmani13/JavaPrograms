package Practice_24_10_21;

import java.util.Scanner;

public class Neon_num3 {
	public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int low, up, count = 0;
 
        System.out.print("Enter lower range value: ");
        low = in.nextInt();
        System.out.print("Enter upper range value: ");
        up = in.nextInt();
 
        for(int i=low; i<=up; i++){
            if(isNeon(i)) {
                System.out.print(i + ",");
                count++;
            }
        }
 
        if(count == 0)
            System.out.println("No Neon Number in the given range");
    }
 
    private static boolean isNeon(int num){
        int sum =0, sqr = num*num;
 
        while(sqr>0){
            sum += sqr%10;   //sum up digit
            sqr = sqr/10;    //remove digit which has been added
        }
 
        return sum == num;
    }
}
