package TransferStatments;

public class DowhileContinue {
public static void main(String[] args) {
	int x=0;
	do
	{
		x++;
		System.out.println(x);
		if(++x<5)
		continue;//goes to check the condition
		x++;
		System.out.println(x);
	}while(++x<10);
}
}
