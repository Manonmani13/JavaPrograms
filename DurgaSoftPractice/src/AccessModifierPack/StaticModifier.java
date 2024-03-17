package AccessModifierPack;

public class StaticModifier {
/*we cannot declare class as static 
 * we can declare inner class as static
 * one copy shared by every object
 */int x=10;
 static  int v=90;
		 public void m1()
		 {
	 System.out.println(x);
		 }
		 public static void m()
		 {
			// System.out.println(x);we cannot give non static variable in static area
		 }
 
}
