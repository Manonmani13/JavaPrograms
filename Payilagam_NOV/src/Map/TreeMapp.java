package Map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;

public class TreeMapp {
	public static void main(String[] args) {
		TreeMap hm = new TreeMap();
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
{Kaniyakumar=9, Mannai=4, Nellai=8, Pandian=9}
[Kaniyakumar, Mannai, Nellai, Pandian]
[Kaniyakumar=9, Mannai=4, Nellai=8, Pandian=9]
[9, 4, 8, 9]
Kaniyakumar
9
Mannai
4
Nellai
8
Pandian
9

*/