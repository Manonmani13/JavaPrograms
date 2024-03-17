package Six6_10_2021;
import java.util.Scanner;
public class Agevalues {
	Scanner sc = new Scanner(System.in);
	 public void age()
	 {
	System.out.println("Enter your age:");
	  int age = sc.nextInt();

	if (age < 18)
	  System.out.print("Child");
	else if ((age >= 18) && (age < 60))
	  System.out.print("Adult");
	else if (age <= 60)
	  System.out.print("Senior");
	else
	  System.out.print("Invalid age");
	 }
	 public static void main(String[] args) {
		Agevalues d=new Agevalues();
		d.age();
	}
}
