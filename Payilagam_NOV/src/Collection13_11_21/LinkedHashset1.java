package Collection13_11_21;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashset1 {
	public static void main(String[] args) {
		LinkedHashSet s=new LinkedHashSet();
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
[11, 20, 800, 3082, abc]
5

*/