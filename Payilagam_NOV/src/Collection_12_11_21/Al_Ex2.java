package Collection_12_11_21;

import java.util.ArrayList;

public class Al_Ex2 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add('m');
		al.add('a');
		al.add('n');
		al.add('o');
		System.out.println(al);
		al.add(2, 'o');
		al.add(true);
		System.out.println(al);
		
	}
}
/*
[m, a, n, o]
[m, a, o, n, o]

*/