package Accessmodifiers;

import AccessModifierPack.Protected;
import AccessModifierPack.ProtectedMethod;

public class ProtectedMeth extends Protected{
	public static void main(String[] args) {
		Protected a=new Protected();
		//a.eat();
		ProtectedMeth a1=new ProtectedMeth();
		a1.eat();
		Protected a2=new ProtectedMeth();
		//a2.eat(); parent referes is not used
	}

}
