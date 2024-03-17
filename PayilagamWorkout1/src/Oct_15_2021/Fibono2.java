package Oct_15_2021;

public class Fibono2 {
public static void main(String[] args) {
	int f=-1,s=1,t=0;
	while(t<=8)
	{
		
		t=f+s;
		System.out.println(t);
		
		f=s;
		s=t;
	}
}
}
