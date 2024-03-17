package collections_17;

import java.util.ArrayList;
import java.util.Collections;

public class Compare1 implements Comparable{
public static void main(String[] args) {
	
		ArrayList al=new ArrayList();
		Compare1 c=new Compare1();
		Compare1 c1=new Compare1();
		Compare1 c2=new Compare1();
		Compare1 c3=new Compare1();
		al.add(c);
		al.add(c1);
		al.add(c2);
		al.add(c3);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
	
}

@Override
public int compareTo(Object arg0) {
	// TODO Auto-generated method stub
	return 0;
}
}
/*
[collections_17.Compare1@6ff3c5b5, collections_17.Compare1@3764951d, collections_17.Compare1@4b1210ee, collections_17.Compare1@4d7e1886]
[collections_17.Compare1@6ff3c5b5, collections_17.Compare1@3764951d, collections_17.Compare1@4b1210ee, collections_17.Compare1@4d7e1886]

*/