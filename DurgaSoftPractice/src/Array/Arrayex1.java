package Array;

public class Arrayex1 {
public static void main(String args[])
{
	int x[][]=new int[3][2];
	System.out.println(x.getClass().getName());
	int []x1=new int[6];
	x1[0]=30;
	x1[7]=33;//error
	x1[-8]=99;//error
	System.out.println(x1[0]);
	//int []x=new int[]; compusalry we should specify the size
	
}
}
