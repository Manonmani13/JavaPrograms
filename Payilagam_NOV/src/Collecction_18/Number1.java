package Collecction_18;

import java.util.ArrayList;
import java.util.Collections;

public class Number1 {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(10);
	al.add(7);
	al.add(50);
	al.add(60);
	ComparatorDemo d=new ComparatorDemo();
	//Collections.sort(al);
	//System.out.println(al);
	ArrayList<String> a=new ArrayList();
	a.add("hi");
	a.add("hello");
	a.add("welcome");
	System.out.println(a);
	ArrayList<Float> al1=new ArrayList();
	al1.add(3.3f);
	al1.add(5.8f);
	al1.add(9.0f);
	//f.display(al);
	Number1 h=new Number1();
	h.display(al1);
	h.display(al);
}
private void display(ArrayList<? extends Number> al) {
	// TODO Auto-generated method stub
	System.out.println(al);
}
}
/*
[hi, hello, welcome]
[3.3, 5.8, 9.0]
[10, 7, 50, 60]

*/