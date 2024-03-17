package Collection13_11_21;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {
	public static void main(String[] args) {
		Sort l=new Sort();
		Sort s=new Sort();
		ArrayList al=new ArrayList();
		//al.add(51);
		//al.add(10);
		al.add(l);
		al.add(s);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
	}
	
}
/*
[51, 10]
[10, 51]
*/