package Count_Programs_3_11_21;

import jdk.jfr.Frequency;

public class Count_pro2 {
	public static void main(String[] args) {
		String name="manonmani Pandukumar";
		char letter[]=new char[name.length()];		
		int frequency[]=new int[name.length()];
		for(int j=0;j<name.length();j++)	
		{
			int count=0;
			char ch=name.charAt(j);
			for(int i=0;i<name.length();i++)
			{
				if(ch==name.charAt(i))
				{
					count++;
				}
				
			}
			letter[j]=name.charAt(j);
			frequency[j]=count;
			System.out.println(name.charAt(j)+"  appears  "+count+"  times");
		}
}
}
/*
m  appears  3  times
a  appears  4  times
n  appears  4  times
o  appears  1  times
n  appears  4  times
m  appears  3  times
a  appears  4  times
n  appears  4  times
i  appears  1  times
   appears  1  times
P  appears  1  times
a  appears  4  times
n  appears  4  times
d  appears  1  times
u  appears  2  times
k  appears  1  times
u  appears  2  times
m  appears  3  times
a  appears  4  times
r  appears  1  times
*/