package Collection_12_11_21;

import java.util.ArrayList;

public class AL_Ex4 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add('m');
		al.add('a');
		al.add('n');
		al.add('o');
		System.out.println(al);
		al.add(true);
		System.out.println(al);
	System.out.println(al.contains(true));
	System.out.println(al.indexOf('a'));
	System.out.println(al.get(3));
	}
}
/*
[m, a, n, o]
[m, a, n, o, true]
true
1
o

*/