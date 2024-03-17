package Game_5_11_21;

import java.util.Random;

public class Random_Ex2 {
public static void main(String[] args) {
	Random n=new Random();
	int s=n.nextInt();
	System.out.println(s);
	Random num=new Random();
	int res;
	for(int i=1;i<=4;i++)
	{
		res=num.nextInt(10);
		System.out.println(res);
	}
}
}
/*
10
5
7
5
1

*/