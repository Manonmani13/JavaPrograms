package Collection13_11_21;

public class OverridingEquals {
	public static void main(String[] args) {
		Override s=new Override();
		Override s2=new Override();
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s.equals(s2));
	}
	public boolean equals(Object o)
	{
		int hc1=this.hashCode();
		Override s=(Override)o;
		int hc2=s.hashCode();
		if(hc1==hc2)
			return true;
		else
			return false;
	}
	/*public int hashCode()
	{
		return 10;
	}*/
}
