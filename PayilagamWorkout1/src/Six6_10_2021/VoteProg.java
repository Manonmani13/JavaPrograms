package Six6_10_2021;

import java.util.Scanner;

public class VoteProg {
int age;
public void vote()
{
	System.out.println("enter your age");
	Scanner n=new Scanner(System.in);
	age=n.nextInt();
	if(age>=18)
	{
		System.out.println("vote now");
	}
	else
	{
		System.out.println("vote after 18");
	}
}
public static void main(String[] args) {
	VoteProg v=new VoteProg();
	v.vote();
}
}
