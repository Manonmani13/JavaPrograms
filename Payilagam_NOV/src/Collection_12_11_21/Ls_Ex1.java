package Collection_12_11_21;

import java.util.LinkedList;

public class Ls_Ex1 {
	public static void main(String[] args) {
		LinkedList al=new LinkedList();
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
	//al.clear();
	//System.out.println(al);
	System.out.println(al.isEmpty());
	LinkedList  al2=new LinkedList();
	al2.addAll(al);
	System.out.println(al2);
	LinkedList  al3=new LinkedList();
	al3.add(10);
	al3.add(20);
	System.out.println(al3);
	}
}
/*
 [m, a, n, o]
[m, a, n, o, true]
true
1
o
[m, a, o, true]
false
[m, a, o, true]
[10, 20]
 */
