package Array_Exam_26_10_21;
import java.util.Scanner;  
import java.lang.Math; 
public class Sprial_Array1 {
	public static void printPattern(int n)  
	{  
	//detrmines the boundary size of the array  
	int size = 2 * n - 1;  
	//inner loop  
	for(int i = 1; i <= size; i++)  
	{  
    
	for(int j = 1; j <= size; j++)  
	{   
	System.out.print(Math.max(Math.abs(i - n), Math.abs(j - n)) + 1 + " ");  
	}  
	System.out.println();  
	}  
	}  
	//driver code  
	public static void main(String args[])  
	{  
	Scanner sc = new Scanner(System.in);  
	System.out.print("Enter the value of n: ");  
	int n = sc.nextInt();  
	System.out.println();  
	//function calling  
	printPattern(n);  
	}  
}
