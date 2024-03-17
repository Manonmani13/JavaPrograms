package Accessmodifiers;

import AccessModifierPack.Protected;

public class ProtectedMeth1 extends  ProtectedMeth {
public static void main(String[] args) {
	Protected a=new Protected();
	//a.eat();
	
	ProtectedMeth a1=new ProtectedMeth();
	//a1.eat();
	ProtectedMeth1 n=new ProtectedMeth1();
	n.eat();
	Protected a2=new ProtectedMeth();
	//a2.eat(); parent referes is not used
	Protected d=new ProtectedMeth1();
	//d.eat();
	ProtectedMeth d1=new ProtectedMeth1();
	//d1.eat();
	
	
}
}
