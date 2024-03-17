package Switch;

public class Example5 {
public static void main(String[] args) {
	int x=10;
	switch(x)
	{
	case 97:
		System.out.println(96);
		break;
	case 98:
		System.out.println(98);
		break;
	// duplicate characters case 'a':
	case 99:
		System.out.println(96);
		break;
		
	}
}
}
