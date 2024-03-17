package collections_17;

import java.util.Comparator;

public class ComparatroDemo implements Comparator {

	@Override
	public int compare(Object a, Object o) {
		// TODO Auto-generated method stub
		ComparatroD g= (ComparatroD) a;
		ComparatroD g1=(ComparatroD) o;
		if(g.i>g1.i)
			return +1;
		else if(g.i<g1.i)
			return -1;
		return 0;
		
	}

}
