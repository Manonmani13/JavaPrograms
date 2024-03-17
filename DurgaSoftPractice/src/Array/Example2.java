package Array;

public class Example2 {
public static void main(String args[]) {
	int a[]= {10,20,30,40,50,60};
	int b[]= {70,80};
	a=b;
	//b=a;
	for(int i=0;i<=args.length;i++) {
		//System.out.println(args[i]);
	}//example2
	String[] argh= {"x","y","z"};
	args=argh;
	for(String s:args)
	{
		System.out.println(s);
	}
	//example 3
	int[][] a1=new int[4][3];
	a1[0]=new int[3];
	a1[1]=new int[2];
	a1=new int[3][2];
}
}
