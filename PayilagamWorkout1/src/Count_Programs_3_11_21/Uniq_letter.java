package Count_Programs_3_11_21;

public class Uniq_letter {
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
			for(int i=j+1;i<name.length();i++)
			{
				if(name.charAt(j)==name.charAt(i))
				{
					frequency[j]=-5;
				}
			}
			//System.out.println(name.charAt(j)+"  appears  "+count+"  times");
		}
		for(int i=0;i<name.length();i++)
		{
			if(frequency[i]==1)
			System.out.println(name.charAt(i)+"  appears  "+frequency[i]+"  times");
		}
}
}
/*
o  appears  1  times
i  appears  1  times
   appears  1  times
P  appears  1  times
d  appears  1  times
k  appears  1  times
r  appears  1  times

*/