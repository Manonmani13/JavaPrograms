package Workout10_19_2021;

public class Final_varaibles extends Variables{

 public static void main(String[] args) {
	final  String name="mano";//we cannot use any access modifiers before final keyword private protected public
	System.out.println(name);
}
}
class Variables
{
	
	public static void main(String[] args) {
		 final String name="maha";
		// name="jai";// we cannot give static for final variabels 
		System.out.println(name);
	}
}