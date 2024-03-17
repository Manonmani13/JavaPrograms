package collections_17;

import java.util.ArrayList;
import java.util.Collections;

public class Compara1 implements Comparable {
	int i;
	public Compara1(int i) {
		// TODO Auto-generated constructor stub
	
		this.i=i;
	}

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		Compara1 c=new Compara1(10);
		Compara1 c1=new Compara1(30);
		Compara1 c2=new Compara1(40);
		Compara1 c3=new Compara1(20);
		al.add(c);
		al.add(c1);
		al.add(c2);
		al.add(c3);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
	
}
public String toString()
{
	return this.i+" ";
	}
@Override
public int compareTo(Object o) {
	// TODO Auto-generated method stub
	Compara1 g= (Compara1) o;
	if(this.i>g.i)
		return -345;
	else if(this.i<g.i)
		return +564;
	return 0;
}
}
/*
[10 , 30 , 40 , 20 ]
[40 , 30 , 20 , 10 ]

*/