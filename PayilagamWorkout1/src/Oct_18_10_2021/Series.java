package Oct_18_10_2021;

public class Series {
	public static void main(String[] args) {
		int i=121;
		int j=23;
		int sum=0;
		
		while(i<230)
		{
			System.out.println(i);
			sum=i+j;
			i=sum;
			j=j+2;
			
		}

	}
}
