package Game_5_11_21;
import java.util.*;
public class Game_Att5 {
	public static void main(String[] args) {
	    Random Random_number= new Random();
	    int right_guess=Random_number.nextInt(100);
	    int turns=0;
	    Scanner scan=new Scanner(System.in);
	    System.out.println("Guess a number between 1 to 100, You will have 10 turns!" );
	    System.out.println("best of luck!");
	    
	    int guess;
	    int i=0;
	    boolean win=false;
	    while(win==false) {
	      guess=scan.nextInt();
	      turns++;
	    
	    if(guess==right_guess) {
	      win=true;
	    }
	    else if(i>8){
	      System.out.println("You loose! the right answer was: "+right_guess);
	      return;
	    }
	    else if(guess<right_guess){
	      i++;
	      System.out.println("Yor Guess is lower than the right guess! Turns left: "+(10-i));
	      
	      
	      
	    }
	    else if(guess>right_guess) {
	      i++;
	      System.out.println("Your Guess Is Higher Than THe Right Guess! Turns left: "+(10-i));
	      
	    }
	    
}
	}
}
