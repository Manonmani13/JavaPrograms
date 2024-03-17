package Count_Programs_3_11_21;

public class Second_highest {
	public static void main(String[] args) {
		String name="manonmani";//m-0,a-1,
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
		System.out.println(max);
		int index=0,in=0;
		int sec=Integer.MIN_VALUE;
		char secfre[]=new char[name.length()];
		//m=2 a=2 n=3 o=1 i=1
		// m=-5 a=-5  n=-5 o=1 n=-5 m=2 a=2 n=3 i=1
		for(int i =0;i<frequency.length;i++)//i=0 0<9 1<9 2<9 3<9 4<9 5<9 6<9
		{
			if(frequency[i]>max)//-5>-2147483648 -5>-5 2>1
			{
				sec=max;//s=2147483648  s=-5,s=1
				in=index;
				secfre[i]=letter[in];
				max=frequency[i];//max=-5,max=1,max=2
				index=i;//0,3,5
			}
			else if(frequency[i]>=sec&&frequency[i]==max)//-5>2147483648 -5!=-5  &&frequency[i]!=max
			{
				sec=frequency[i];
				in=i;
				secfre[i]=letter[in];
			}
			
			
		}
		
		System.out.println(sec+" comes at  "+in+" character  "+letter[in]);
}
}
/*
m  appears  2  times
a  appears  2  times
n  appears  3  times
-2147483648
2 comes at  5 character  m
*/