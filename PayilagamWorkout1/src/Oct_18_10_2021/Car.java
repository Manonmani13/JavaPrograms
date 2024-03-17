package Oct_18_10_2021;

public class Car
{
	public static void main(String[] args) {
		
	
	String name = "Re5u9l6t";

	for (int i = 0; i < name.length(); i++) {
		char c = name.charAt(i);
		//System.out.print(c);
		if (c >='0' && c <= '9') {//1 0=0 0 1=0 1 1=1
			System.out.println(c);

		}
		
	} 
}
}