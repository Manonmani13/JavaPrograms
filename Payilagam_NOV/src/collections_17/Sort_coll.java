package collections_17;

import java.util.ArrayList;
import java.util.Collections;

public class Sort_coll {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(10);
	al.add(40);
	al.add(20);
	al.add(30);
	System.out.println(al);
	Collections.sort(al);
	System.out.println(al);
}
}
/*
[10, 40, 20, 30]
[10, 20, 30, 40]

*/