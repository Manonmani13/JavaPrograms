package JavaVariables;

public class Byte_1 {
	public static void main(String[] args){  
		//Overflow  
		int a=130;  
		byte b=(byte)a;  //-126
		System.out.println(a);  //130
		System.out.println(b);  
		}
}
