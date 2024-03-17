package BasicPrograms_10_11_21;

public class Null_Ex2 {
	public static void main(String[] args) {
		Null_Ex n=new Null_Ex();
		System.out.println(n.hashCode());
		try {
		n=null;
		System.out.println(n.hashCode());
		}
		catch(NullPointerException e)
		{
			System.out.println(" check n");
		}

	}
}
/*
929338653
 check n

*/