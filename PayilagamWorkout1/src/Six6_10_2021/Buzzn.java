package Six6_10_2021;
import java.util.*;
public class Buzzn {
public void Buzz()
{
	 Scanner sc = new Scanner(System.in);
	   
	 System.out.println("Enter the number to check Buzz number:");
	  int num = sc.nextInt();
	  
	 if((num % 10 == 0) || (num % 7 == 0)){
	  System.out.println(num+ " is a Buzz number ");	
	 }
	 else {
	   System.out.println(num+ " is not a Buzz number");	
	   }
}
public static void main(String[] args) {
	Buzzn b=new Buzzn();
	b.Buzz();
}
}
