package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMap3 {
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
		    
		 
		 
	}
}
/*
{English I=9, Tamil II=9, Science=2, Mathematics=2, Social Science=2, Tamil I=9, English II=9}
[English I, Tamil II, Science, Mathematics, Social Science, Tamil I, English II]
[9, 9, 2, 2, 2, 9, 9]
[English I=9, Tamil II=9, Science=2, Mathematics=2, Social Science=2, Tamil I=9, English II=9]
{English I=9, Tamil II=9, Science=2, Mathematics=2, Social Science=2, Tamil I=9, English II=9}


*/