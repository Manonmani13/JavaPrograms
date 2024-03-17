package Collecction_18;

import java.util.ArrayList;
import java.util.Collections;

public class Integer1 {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(10);
	al.add(7);
	al.add(50);
	al.add(60);
	ComparatorDemo d=new ComparatorDemo();
	Collections.sort(al);
	System.out.println(al);
}
}
//[7, 10, 50, 60]
