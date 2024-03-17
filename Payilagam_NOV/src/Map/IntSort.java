package Map;

import java.util.Arrays;

public class IntSort {
public static void main(String[] args) {
	int a[]= {5,10,5,8,13,7};
	for(int no:a)
	{
		System.out.println(no);
	}
	Arrays.sort(a);
	System.out.println();
	for(int no:a)
	{
		System.out.println(no);
	}
}
}
/*
 5
10
5
8
13
7

5
5
7
8
10
13

 */
