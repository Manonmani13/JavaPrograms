package Random_7_11_21;
import java.util.*;
public class NextBool_Ex2 {
public static void main(String[] args) {
	Random random= new Random();  
    Scanner scanner = new Scanner(System.in);  
System.out.println("For Head: enter true.\nFor tail : enter false");  
System.out.print("Enter your choice : ");Boolean val = scanner.nextBoolean();  
//give randomly a boolean value.  
Boolean val1 = random.nextBoolean();  
System.out.println("Outcome is : "+val1);  
if(val.equals(val1)){  
System.err.println("Congratulations!!You won the round!");  
    }  
else{  
System.err.println("You lose the game.");  
     }
}
}
/*
For Head: enter true.
For tail : enter false
Enter your choice : false
Outcome is : false
Congratulations!!You won the round!

*/