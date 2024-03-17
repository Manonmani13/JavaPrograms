package Random_7_11_21;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class NextDouble_Ex3 {
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
	            Double val = random.nextDouble();  
	System.out.println(j+++". " +xyz+"'s id  : "+val);  
	        }  
	    }  
}
/*
Enter number of students.3
Enter name of 3 students.
1 1
2 2
3 3
1. 1's id  : 0.7798884246647939
2. 2's id  : 0.14000099426140278
3. 3's id  : 0.04832364605035788
*/