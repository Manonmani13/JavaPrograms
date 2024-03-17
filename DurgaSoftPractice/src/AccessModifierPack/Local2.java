package AccessModifierPack;

public class Local2 {
public static void main(String[] args) {
	m1(10,20);//actual parameter
	m12(10,20);
	
}
public static void m1(int x,int y)//formal parameter
{
	x=100;y=200;
	System.out.println(x+" "+y);
}
public static void m12(final int x,final int y)//formal parameter
{
	//x=100;
	//y=200;
	System.out.println(x+" "+y);
}
}
