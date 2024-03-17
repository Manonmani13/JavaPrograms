package TransferStatments;

public class Example1 {
public static void main(String[] args) {
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			if(i==j)
				break;
			System.out.println(i+ " "+j);
		}
	}
	System.out.println("brealk label");
	li:
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			if(i==j)
				break li;
			System.out.println(i+ " "+j);
		}
	}
	System.out.println("continue");
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			if(i==j)
				continue;
			System.out.println(i+ " "+j);
		}
	}
	System.out.println("continue label");
	li:
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			if(i==j)
				continue li;
			System.out.println(i+ " "+j);
		}
	}
}
}
