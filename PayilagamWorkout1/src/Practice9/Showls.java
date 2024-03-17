package Practice9;

public class Showls {
	int i,j,k;
	 Showls()
	{
	System.out.println("Default constructors");	
	}
	Showls(int i,int j)
	{
		this();
		this.i=i;
		this.j=j;
		System.out.println(i+" "+j);
	}
	Showls(int i, int j, int k)
	{
		this(i,j);
		this.k=k;
		System.out.println(i+" "+j+" "+k); 	
	}
	
public static void main(String args[])
{
	//Showls sl1=new Showls(88,55);
	Showls sl=new Showls(33,45,44);
}


}
