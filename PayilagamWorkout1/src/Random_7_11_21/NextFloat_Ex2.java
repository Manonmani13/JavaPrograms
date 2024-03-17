package Random_7_11_21;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class NextFloat_Ex2 {
	static  int j=1;  
	public static void main(String[] args) {  
	        Scanner scanner = new Scanner(System.in);  
	System.out.print("Enter number of students.");  
	int capacity = scanner.nextInt();  
	ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<String>(capacity);  
	System.out.println("Enter name of "+capacity+" students.");  
	for (int i=0;i<capacity;i++){  
	System.out.print(j++ +" ");String str = scanner.next();  
	queue.add(str);  
	        }  
	j=1;  
	        Random random = new Random();  
	for (String xyz :queue) {  
	            Float val = random.nextFloat();  
	System.out.println(j+++". " +xyz+"'s id  : "+val);  
	        }  
	    }  
}
/*
Enter number of students.1
Enter name of 1 students.
1 2
1. 2's id  : 0.738186
*/