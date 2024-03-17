package Workout10_19_2021;

public class Num2_3_5 {
public static void main(String[] args) {
	int i=2,n=1;
	while(i<29)
	{
	System.out.println(i);
	
	if(i==3||i==5||i==11)
	{
		i=i+2;
		System.out.println();
	}
	else if(i==7||i==13)
	{
		i=i+4;
		System.out.println(i);
	}
	else
	{
		i=i+5;
		System.out.println(i);
	}
	i++;
	}
}
}
