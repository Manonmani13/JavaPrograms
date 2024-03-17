package TransferStatments;

public class Break1 {
public static void main(String[] args) {
	int x=0;
	//inside switch
	switch(x)
	{
	case 0:
		System.out.println(x);
		break;
		
	}
	//inside loops
	for(int i=0;i<10;i++)
	{
		if(i==5)
		break;
		System.out.println(i);
	}
	//indifr labled blocks
	int x1=10;
	l1:
	{
		System.out.println("begin");
		if(x==10)
			break l1;
		System.out.println("end");
	}
}
}
