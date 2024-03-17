package Switch;

public class Example3 {
public static void main(String[] args) {
	int x=10;
	switch(x+1)
	{
	case 10:
		System.out.println(10);
		break;
	case 10+20+30:
		System.out.println(60);
	break;
	}
	byte b=10;
	switch(b)
	{
	case 10:
	System.out.println(10);
	break;
	case 100:
		System.out.println(100);
		break;
	case 109://1000 is int type
		System.out.println(1000);
		break;
	}
}
}
