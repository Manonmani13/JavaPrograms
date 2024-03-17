package Oct_15_2021;

public class Without3rdno_fibno {
	public static void main(String[] args) {
		int f=-1,s=1,i=1;
		int pri=f+s;
		while(i<=10)
		{
			
			
			System.out.println(f+s);
			
			s=f+s;
			f=s-f;
			i++;
		}
}
	
}