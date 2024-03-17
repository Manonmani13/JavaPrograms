package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashMap4 {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		  hm.put("Tamil I", 9);
		  hm.put("Tamil II", 9);
		  hm.put("English I", 9);
		  hm.put("English II", 9);
		  hm.put("Mathematics", 2);
		  hm.put("Science", 2);
		  hm.put("Social Science", 2);
		  
		  System.out.println(hm);
		  
		  Set s = hm.keySet();
		  System.out.println(s);
		  
		  Collection c= hm.values();
		  System.out.println(c);
		  Set s1=hm.entrySet();
		  System.out.println(s1);
		  System.out.println(hm);
		  Set ss=new HashSet();
		  ss.add(10);
		  ss.add(5);
		  ss.add(30);
		  ss.add(20);
		  System.out.println(ss);
		  Iterator i=ss.iterator();
	}
}
/*
 {English I=9, Tamil II=9, Science=2, Mathematics=2, Social Science=2, Tamil I=9, English II=9}
[English I, Tamil II, Science, Mathematics, Social Science, Tamil I, English II]
[9, 9, 2, 2, 2, 9, 9]
[English I=9, Tamil II=9, Science=2, Mathematics=2, Social Science=2, Tamil I=9, English II=9]
{English I=9, Tamil II=9, Science=2, Mathematics=2, Social Science=2, Tamil I=9, English II=9}
[20, 5, 10, 30]

 */
