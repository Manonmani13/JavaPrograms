package Map;
import java.util.*;
public class Hm3 {
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
	    
	  Set s1 = hm.entrySet();
	  Iterator i = s1.iterator(); 
	  boolean b = i.hasNext();
	  while(b==true)
	  {
	    Object o = i.next(); 
	    Map.Entry entry = (Map.Entry) o; 
	    //System.out.println(entry.getKey() + "starts at "+ entry.getValue());
	    Object o2 = entry.getKey();
	    String st1 = (String) o2; 
	    if(st1.equals("Mathematics"))
	    {
	      System.out.println("yes, starts at "+entry.getValue());
	    }    
	    //System.out.println(i.next());
	    b = i.hasNext();
	  }
}
}
/*
{English I=9, Tamil II=9, Science=2, Mathematics=2, Social Science=2, Tamil I=9, English II=9}
[English I, Tamil II, Science, Mathematics, Social Science, Tamil I, English II]
[9, 9, 2, 2, 2, 9, 9]
yes, starts at 2
*/