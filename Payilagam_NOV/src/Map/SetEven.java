package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEven {
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
	  Set ss=new HashSet();
	  ss.add(10);
	  ss.add(5);
	  ss.add(30);
	  ss.add(20);
	  System.out.println(ss);
	  Iterator i=ss.iterator();
	  boolean b=i.hasNext();
	  while(b==true)
	  {
	    Object o=i.next();
	    Integer no=(Integer)o;
	    if(no%2==0)
	        System.out.println(no);
	    
	    b = i.hasNext();
	  }
	  
	  
}
}
/*
{English I=9, Tamil II=9, Science=2, Mathematics=2, Social Science=2, Tamil I=9, English II=9}
[20, 5, 10, 30]
20
10
30
*/