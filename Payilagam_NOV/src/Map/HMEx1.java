package Map;

import java.util.*;

public class HMEx1 {
public static void main(String[] args) {
	LinkedHashMap hm = new LinkedHashMap();
	  hm.put("Nellai", 8);
	  hm.put("Pandian", 9);
	  hm.put("Mannai", 4);
	  hm.put("Kaniyakumar", 9);
	System.out.println(hm);
	System.out.println(hm.keySet());
	System.out.println(hm.entrySet());
	System.out.println(hm.values());
	Set s=hm.entrySet();
	Iterator i=s.iterator();
	while(i.hasNext())
	{
		Map.Entry me=(Map.Entry)  i.next();
		System.out.println(me.getKey());
		System.out.println(me.getValue());
	}
}
}
/*
{Nellai=8, Pandian=9, Mannai=4, Kaniyakumar=9}
[Nellai, Pandian, Mannai, Kaniyakumar]
[Nellai=8, Pandian=9, Mannai=4, Kaniyakumar=9]
[8, 9, 4, 9]
Nellai
8
Pandian
9
Mannai
4
Kaniyakumar
9


*/