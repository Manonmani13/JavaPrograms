package Practice8_10_2021;

public class Alpha {
//2A4B6C
	int i=2;
	//char c='A';
	int c=65;
	char h='a';
	void num()
	{
		while(i<=10)
		{
			while(c<=90)
			{
				System.out.println(i+" ");
				
				System.out.println((char)c+" ");
				//System.out.println((int)h);
				c=c+1;
				i=i+2;
			}
		
			
		}
	}
	public static void main(String[] args) {
		Alpha n=new Alpha();
		n.num();
		
	}
}
