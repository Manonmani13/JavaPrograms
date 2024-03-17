package collections_17;

import java.util.ArrayList;
import java.util.Collections;

public class Lap implements Comparable{
	String lap;
	int price;
public Lap(String lap,int price ) {
		// TODO Auto-generated constructo/r stub
		this.price=price;
		this.lap=lap;
	}

public static void main(String[] args) {
	ArrayList al=new ArrayList();
	Lap l=new Lap("Del",44400);
	Lap l1=new Lap("Sony",50000);
	Lap l2=new Lap("Hp",60000);
	Lap l3=new Lap("Acer",70000);
	Lap l4=new Lap("Lenovo",46000);
	al.add(l);
	al.add(l1);
	al.add(l2);
	al.add(l3);
	al.add(l4);
	//System.out.println(al);
	Collections.sort(al);
	System.out.println("decreasing amount"+al);
	//System.out.println("ascending order amount"+al);
	
}
public String toString()
{
	return price+" ";
	
}
@Override
public int compareTo(Object o) {
	// TODO Auto-generated method stub
	Lap l=(Lap)o;
	if(this.price>l.price)
		return -1;
	 if(this.price<l.price)
		return +1;
	return 0;
}
}
