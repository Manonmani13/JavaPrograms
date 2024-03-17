package Game_5_11_21;

import java.util.Random;
import java.util.Scanner;

public class GAme_Att3 {
	public static void main(String[] args) {
		int n=3,n1=3;int k = 3;
		int v[]=new int[n1];
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
						//v=j;
					}
					else
					{
						if(ch[j]!='C'&&ch[j]!='P'&&val[i]!=val1[j])
							ch[j]='X';
						 k = j;
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
								for(int o=k;o<v.length;o++)
								{
								v[o]=sc.nextInt();
								
								val1[j]=v[o];
								
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
