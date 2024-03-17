package Collecction_18;

import java.util.ArrayList;

public class Gen1 {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add(10);
	al.add(5);
	al.add(7);
	al.add(3);
	Gen1 g = new Gen1();
	g.display(al); 
	ArrayList<Float> al2= new ArrayList();
	al2.add(5.4f);
	al2.add(10.3f);
	al2.add(3.8f);
	g.display(al2);
	ArrayList<String> al3= new ArrayList();
	al3.add("abcd");
	al3.add("bcd");
	al3.add("gh");
	//g.display(al3);
}
private void display(ArrayList<? extends Number> al) {
	// TODO Auto-generated method stub
	System.out.println(al);
	
} 
}
/*
[10, 5, 7, 3]
[5.4, 10.3, 3.8]
*/