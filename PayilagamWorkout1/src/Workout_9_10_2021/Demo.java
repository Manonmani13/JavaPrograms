package Workout_9_10_2021;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo();
		d.mm();
		

	}
	
	void mm()
	{
	    int a=1, b=3, c=4, n=7, sum, i;
	   System.out.println(a+"\n "+b+"\n "+c);
	    for(i=4; i<=n; i++)
	    {
	        sum = a+b+c;
	        System.out.println(sum);
	      a = b;
	      b = c;
	      c = sum;
	    }
	}

}
