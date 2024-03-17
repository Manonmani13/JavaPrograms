package collections_17;

import java.util.ArrayList;
import java.util.Collections;

public class Compara {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		Compara c=new Compara();
		Compara c1=new Compara();
		Compara c2=new Compara();
		Compara c3=new Compara();
		al.add(c);
		al.add(c1);
		al.add(c2);
		al.add(c3);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
	}
}
/*
[collections_17.Compara@6ff3c5b5, collections_17.Compara@3764951d, collections_17.Compara@4b1210ee, collections_17.Compara@4d7e1886]
Exception in thread "main" java.lang.ClassCastException: class collections_17.Compara cannot be cast to class java.lang.Comparable (collections_17.Compara is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
	at java.base/java.util.ComparableTimSort.countRunAndMakeAscending(ComparableTimSort.java:320)
	at java.base/java.util.ComparableTimSort.sort(ComparableTimSort.java:188)
	at java.base/java.util.Arrays.sort(Arrays.java:1315)
	at java.base/java.util.Arrays.sort(Arrays.java:1509)
	at java.base/java.util.ArrayList.sort(ArrayList.java:1750)
	at java.base/java.util.Collections.sort(Collections.java:145)
	at collections_17.Compara.main(Compara.java:18)

*/