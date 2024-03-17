package Switch;

public class Fallthrough {
	public static void main(String[] args) {
		int x=10;
		switch(x)
		{
		case 0:
			System.out.println(96);
			
		case 1:
			System.out.println(98);
		case 2:
			System.out.println(96);
		default:
			System.out.println("hi");
			
		}
	}
}
