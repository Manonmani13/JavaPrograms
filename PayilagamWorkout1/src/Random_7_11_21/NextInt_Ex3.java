package Random_7_11_21;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class NextInt_Ex3 {
	static int j=1;  
	public static void main(String[] args) {  
	        Scanner scanner = new Scanner(System.in);  
	System.out.print("Enter number of players.");  
	int capacity = scanner.nextInt();  
	ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<String>(capacity);  
	System.out.println("Enter name of " + capacity + " Players.");  
	for (int i = 0; i < capacity; i++) {  
	System.out.print(j++ + " ");  
	            String str = scanner.next();  
	queue.add(str);  
	        }  
	j = 1;  
	        Random random = new Random();  
	for (String xyz : queue) {  
	            Integer val = random.nextInt(capacity);  
	System.out.println(j++ +". " +xyz+" will have "+val+" bonus points.");  
	        }  
}
}
/*
Enter number of players.5
Enter name of 5 Players.
1 32
2 21
3 12
4 11
5 32
1. 32 will have 0 bonus points.
2. 21 will have 1 bonus points.
3. 12 will have 0 bonus points.
4. 11 will have 1 bonus points.
5. 32 will have 3 bonus points.
*/