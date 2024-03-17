package Collection13_11_21;

import java.util.HashSet;

public class HashSet1 {
public static void main(String[] args) {
	HashSet s=new HashSet();
	s.add(11);
	s.add(20);
	s.add(800);
	s.add(3082);
	s.add("abc");
	System.out.println(s);
	System.out.println(s.size());
}
}
/*
[800, abc, 20, 3082, 11]
5
*/