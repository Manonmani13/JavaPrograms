package Oct_16_10_2021;

public class Chennal extends Tv {
	int i=10;
public static void main(String[] args) {
	Chennal c=new Chennal();
	Chennal c2=new Chennal();
	System.out.println(c.hashCode());
	System.out.println(c);
//tostring method return->package+classname+"@"+hexadecimal of hashcode
}

public int hashCode()
{
	return 12;
}
}
