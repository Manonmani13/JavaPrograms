package collections_17;

import java.util.Arrays;

public class Arra {
public static void main(String[] args) {
	int []a= {10,20,30};
	int []b= {10,20,30};
	int i=0;
	boolean same=true;
	while(i<a.length)
	{
		if(a[i]!=b[i])
		{
		same=false;
		System.out.println("not same");
		break;
		}
		i++;
	}
	if(same==true)
		System.out.println("both arrays are same");
	else
		System.out.println("both arrays are not same");
}
}
//both arrays are same