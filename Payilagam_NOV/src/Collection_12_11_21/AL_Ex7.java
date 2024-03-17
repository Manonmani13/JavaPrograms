package Collection_12_11_21;

import java.util.ArrayList;

public class AL_Ex7 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add('m');
		al.add('a');
		al.add('n');
		al.add('o');
		System.out.println(al);
	
	ArrayList  al3=new ArrayList();
	al3.add(10);
	al3.add(20);
	System.out.println(al3);
	al3.retainAll(al3);
	System.out.println(al3);
	al3.addAll(1,al);
	System.out.println(al3);
	al3.retainAll(al);//remove 
	System.out.println(al3);
	
	}
}
/*
 [m, a, n, o]
[10, 20]
[10, m, a, n, o, 20]
[m, a, n, o]

 */
