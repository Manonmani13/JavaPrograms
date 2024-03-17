package Game_3_11_21;

import java.util.Scanner;

public class Game_Att8 {
	
	public static void main(String[] args) {
		
		Boolean boo=false;
		
		int n=3;
		int v=3;
		int a[]=new int[n];
		int b[]=new int[v];
		char ch[]=new char[v];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++)a[i]=sc.nextInt();
		for(int j=0;j<v;j++) b[j]=sc.nextInt();
				
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<v;j++) {
				if(a[i]==b[j]) {
					ch[j]= 'C';
				}
				else if (a[i]==b[j] && i!=j) {
					
					ch[j]='P';
					b[i]=a[j];
				}
				else {
					ch[j]='X';
					boo=true;
				}
					
			}
			
			
		}
		for (char c: ch) {
			System.out.println(c);
		}
	}

}
