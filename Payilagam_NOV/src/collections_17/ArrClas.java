package collections_17;

import java.util.Arrays;

public class ArrClas {
	public static void main(String[] args) {
		int []a= {10,20,30};
		int []b= {100,20,380};
		System.out.println(Arrays.equals(a, b));
		Arrays.sort(b);
		for(int i=0;i<b.length;i++)
		{
				System.out.println(b[i]);
		}
}
}