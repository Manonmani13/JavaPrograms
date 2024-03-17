package Collecction_18;

import java.util.ArrayList;

public class FloList {
public static void main(String[] args) {
	FloList f=new FloList();

	ArrayList al=new ArrayList();
	al.add(3.3f);
	al.add(5.8f);
	al.add(9.0f);
	f.display(al);
}

private void display(ArrayList<Float> al) {
	// TODO Auto-generated method stub
	System.out.println(al);
}
}
//[3.3, 5.8, 9.0]