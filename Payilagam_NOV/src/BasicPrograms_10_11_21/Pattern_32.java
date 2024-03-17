package BasicPrograms_10_11_21;

public class Pattern_32 {
public static void main(String[] args) {
	int n=5,x;
	for(int i=0;i<5;i++)
	{
		x=i;
		for(int j=0;j<5;j++)
		{
			System.out.print((char)(x-n+65)+" ");
		}
		System.out.println();
	}
}
}
/*
< < < < < 
= = = = = 
> > > > > 
? ? ? ? ? 
@ @ @ @ @ 
s
*/