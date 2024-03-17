package Random_7_11_21;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class NextGussian_Ex3 {
	static  int j=1;  
	public static void main(String[] args) {  
	        Scanner scanner = new Scanner(System.in);  
	System.out.print("Enter the number of Visitors.");  
	int capacity = scanner.nextInt();  
	ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<String>(capacity);  
	System.out.println("Enter the name of "+capacity+" students.");  
	for (int i=0;i<capacity;i++){  
	System.out.print(j++ +" ");String str = scanner.next();  
	queue.add(str);  
	        }  
	j=1;  
	        Random random = new Random();  
	for (String xyz :queue) {  
	            Double val = random.nextGaussian();  
	if(val<0){  
	System.out.println("Sorry! "+xyz+" you are out of the game.");  
	            }  
	else{  
	System.out.println("Congratulations! "+xyz+" you are in the game.");  
	            }  
	        }  
	    }  

}
/*
2Enter the number of Visitors.
Enter the name of 2 students.
1 23
2 23
Congratulations! 23 you are in the game.
Congratulations! 23 you are in the game
*/