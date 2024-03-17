package Interview_prac_30_10_21;

public class Fibbnocci {
public static void main(String[] args) {
	System.out.println("Fibbnocci ");
	int c=10;int n=0,n1=1;
	for(int i=1;i<=10;i++)
	{
		int co=n+n1;
		System.out.println(co);
		n=n1;
		n1=co;
	}
	
}
}
/*
 * Fibbnocci 
1
2
3
5
8
13
21
34
55
89

 */
