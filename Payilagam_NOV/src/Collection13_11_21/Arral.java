package Collection13_11_21;

import java.util.ArrayList;

public class Arral {
	public static void main(String[] args) {
		Arral l=new Arral();
		Arral s=new Arral();
		ArrayList al=new ArrayList();
		al.add(l);
		al.add(s);
		System.out.println(al);
	}
	public String toString()
	{
		return "hi";
	}
}
//[hi, hi]