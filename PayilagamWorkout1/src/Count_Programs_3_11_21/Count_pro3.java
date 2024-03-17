package Count_Programs_3_11_21;

public class Count_pro3 {
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
			for(int i=0;i<name.length();i++)
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
			System.out.println(name.charAt(i)+"  appears  "+frequency[i]+"  times");
		}
}
}
