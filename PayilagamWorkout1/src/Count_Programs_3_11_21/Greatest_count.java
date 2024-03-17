package Count_Programs_3_11_21;

public class Greatest_count {
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
			if(frequency[i]>1&&name.charAt(i)!=' ')
			System.out.println(name.charAt(i)+"  appears  "+frequency[i]+"  times");
		}
		int max=Integer.MIN_VALUE;
		int index=0;
		int min=Integer.MAX_VALUE;
		for(int i =0;i<frequency.length;i++)
		{
			if(frequency[i]>max)
			{
				max=frequency[i];
				index=i;
			}
			
		}
		System.out.println(max+" comes at  "+index+" character  "+name.charAt(index));
}
}
/*
n  appears  4  times
u  appears  2  times
m  appears  3  times
a  appears  4  times
4 comes at  12 character  n
*/