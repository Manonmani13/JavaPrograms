package Collecction_18;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {
public static void main(String[] args) {
	ArrayList l=new ArrayList();
	l.add(10);
	l.add(5);
	l.add(7);
	l.add(3);
	ComparatorDemo d=new ComparatorDemo();
	Collections.sort(l,d);
	System.out.println(l);
	
}
}
//[3, 5, 7, 10]