package Interview_prac_30_10_21;

import java.util.Scanner;

public class Char_word_count {
public static void main(String[] args) {
	String text;
	System.out.println("Enter any string");
	Scanner sc=new Scanner(System.in);
	text=sc.nextLine();
	int co=0;
	int wc=0;
	for(int i=0;i<text.length()-1;i++)
	{
		if(text.charAt(i)!=' ')
		{
			co++;
		}
		if(text.charAt(i)==' '&&text.charAt(i+1)!=' ')
		{
			wc++;
		}
		
	}
	System.out.println("Word count "+ (wc+1));
	System.out.println("Character count "+co);
	
}
}
/*
Enter any string
hello welcome to this meeting
Word count 5
Character count 24

*/