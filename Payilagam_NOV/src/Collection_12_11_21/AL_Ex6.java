package Collection_12_11_21;

import java.util.ArrayList;

public class AL_Ex6 {
	
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
		al.remove(2);
		System.out.println(al);
		al.clear();
		System.out.println(al);
		System.out.println(al.isEmpty());
		ArrayList  al2=new ArrayList();
		al2.addAll(al);
		System.out.println(al2);
		ArrayList  al3=new ArrayList();
		al3.add(10);
		al3.add(20);
		System.out.println(al3);
		}
	
}
/*
 * [m, a, n, o]
[m, a, n, o, true]
true
1
o
[m, a, o, true]
[]
true
[]
[10, 20]
 */
