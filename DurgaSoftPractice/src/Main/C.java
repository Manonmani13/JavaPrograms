package Main;

 class C extends P {
		public static void main(String[] args) {
			System.out.println("child main");//method hiding
			//overloading is applicable
			//insted of overriding methd hidiing is applicable
		}
}
class P
{
	public static void main(String[] args) {
		System.out.println("parent main");
	}
}