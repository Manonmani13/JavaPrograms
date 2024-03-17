package AccessModifierPack;

public class ProtectedMethod extends Protected {
public static void main(String[] args) {
	ProtectedMethod a=new ProtectedMethod();
	a.eat();
	Protected a1=new Protected();
	a1.eat();
	Protected a2=new ProtectedMethod();
	a2.eat();
}
}
