package AccessModifierPack;

public class StaticVariable {
static int x;
//at the time pf declaration
final static int x1=10;//it is possible because we are initized it
/*
 * final static int x;
 * you cannot give final for static because we have to initize value for static variable
 * 
 *///inside static block
final static int y;
static 
{
	y=10;
}
/*final static int g;
public static void j()
{
	g=10;
}
final static int h;
public void j()
{
cannot assign a value to final value
	h=20;
}*/
public static void main(String[] args) {
	System.out.println(x);//static variable will provide default values
}
}
