package Oct_15_2021;

public class Fibnoci1 {
public static void main(String[] args) {
	int f=0,s=1,t=0;
	System.out.println(f+" \n"+ s);
	while(t<=8)
	{
		
		t=f+s;
		System.out.println(t);
		//System.out.println(f+" "+s+" "+t);
		f=s;
		s=t;
	}
}
}
