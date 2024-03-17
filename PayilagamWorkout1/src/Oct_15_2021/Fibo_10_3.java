package Oct_15_2021;

public class Fibo_10_3 {
public static void main(String[] args) {
	int i=1,s=1,f=-1,t=0;
	
		while(i<=10)
		{
			t=f+s;
			System.out.println(t);
			f=s;
			s=t;
			i++;
		}
	
	
}
}
