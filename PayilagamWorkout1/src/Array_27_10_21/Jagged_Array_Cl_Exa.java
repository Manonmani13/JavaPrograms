package Array_27_10_21;

public class Jagged_Array_Cl_Exa {
public static void main(String[] args) {
	int a[][]=new int[4][];
	System.out.println(a.length);
	a[0]=new int[4];
	a[1]=new int[3];
	a[2]=new int[2];
	a[3]=new int[1];
	System.out.println(a[0].length);
	System.out.println(a[1].length);
	System.out.println(a[2].length);
	System.out.println(a[3].length);
}
}
/*
4
4
3
2
1

 
*/