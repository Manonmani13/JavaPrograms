package Practice10;

abstract public class FactoryDemo extends Smartphone{
	boolean isOriginalPiece=false;
	 int price=0;
	abstract void verifyFingerPrint();
	abstract void providePattern();
	 void browse()
	 {
	 System.out.println("Factory Demo  browsing");
	 }
}
