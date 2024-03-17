package Map;

import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public class Weak {
	public static void main(String[] args) {
		WeakHashMap hm = new WeakHashMap();
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
{Mannai=4, Nellai=8, Pandian=9, Kaniyakumar=9}
[Mannai, Nellai, Pandian, Kaniyakumar]
[Mannai=4, Nellai=8, Pandian=9, Kaniyakumar=9]
[4, 8, 9, 9]
Mannai
4
Nellai
8
Pandian
9
Kaniyakumar
9

*/