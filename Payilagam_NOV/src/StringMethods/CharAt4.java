package StringMethods;

public class CharAt4 {
public static void main(String[] args) {
	String n="i am manonmani";
	for (int i=0;i<n.length()-1;i++)
	{
		if(i%2==0)
			System.out.println(i+ " "+n.charAt(i));
		else
			System.out.println(i+" "+n.charAt(i));
	}
}
}
/*
0 i
1  
2 a
3 m
4  
5 m
6 a
7 n
8 o
9 n
10 m
11 a
12 n

*/