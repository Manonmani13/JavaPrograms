package Workout_9_10_2021;

public class Num1_3_4_8_15_27 {
int n=1,n1=2;

void odd()
{
	do
	{
		System.out.println(n);
		n=n+n1;
		n1=n+n1;
	}while(n<=27);
}
public static void main(String[] args) {
	Num1_3_4_8_15_27 n=new Num1_3_4_8_15_27();
	n.odd();
}
}
