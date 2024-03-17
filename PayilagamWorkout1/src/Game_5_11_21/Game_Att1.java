package Game_5_11_21;

import java.util.Random;
import java.util.Scanner;

public class Game_Att1 {
public static void main(String[] args) {
	int n=3,n1=3;
	int v;
	Random r=new Random();
	int val[]=new int[n];
	int val1[]=new int[n1];
	char ch[]=new char[n1];
	
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<val.length;i++)
	{
		val[i]=r.nextInt(10);
		System.out.println(val[i]);
	}
	if(n==n1)
	{
		for(int i=0;i<val1.length;i++)
		{
			val1[i]=sc.nextInt();
			//System.out.println(val1[i]);
		}
		
		for(int i=0;i<val.length;i++)
		{
			for(int j=0;j<val1.length;j++)
			{
				if(val[i]==val1[j]&&i==j)
				{
					ch[j]='C';
				}
				else if(val[i]==val1[j]&&i!=j)
				{
					ch[j]='P';
					v=j;
				}
				else
				{
					if(ch[j]!='C'&&ch[j]!='P'&&val[i]!=val1[j])
						ch[j]='X';
						v=j;
				}
			}
		}
		for(char c=0;c<ch.length;c++)
		{
			System.out.println(ch[c]);
		}
		for(char c=0;c<ch.length;c++)
		{
		
			if(ch[c]=='X')
			{
				for(int i=0;i<val.length;i++)
				{
					for(int j=0;j<val1.length;j++)
					{
						
						do {
						if(ch[j]!='C'&&ch[j]!='P'&&ch[j]=='X')
						{
							v=sc.nextInt();
							val1[j]=v;
							System.out.println(val1[j]+" "+j);
							if(val[i]==val1[j]&&i==j)
							{
								ch[j]='C';
								System.out.println(ch[j]);
							
							}
							else
							{
								ch[j]='X';
								System.out.println(ch[j]);
							}
						}
						}while(ch[j]=='X');
						
					}
					
				}
			}
		}
	
	}
	else
	{
		System.out.println("invalid size");
	}
	
}
}
/*
6
9
7
3
4
2
X
X
X
1
1 0
X
2
2 0
X
3
3 0
X
4
4 0
X
5
5 0
X
6
6 0
C
7
7 1
X
8
8 1
X
9
9 1
X
0
0 1
X
1
1 1
X
2
2 1
X
3
3 1
X
4
4 1
X
5
5 1
X

*/