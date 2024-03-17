package Collection13_11_21;

public class Override {
	public static void main(String[] args) {
		Override s=new Override();
		Override s2=new Override();
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s.equals(s2));
	}
	public boolean equals(Object o)
	{
		return true;
	}
	public int hashCode()
	{
		return 10;
	}
}
/*
10
10
true

*/