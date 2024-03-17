package DoWhile_Demos;

public class ThreeDivi3 {
int no=1;
void divi()
{
	do
	{
		System.out.println(no);
		no=no+2;
	}while(no<=9);
}
public static void main(String[] args) {
	ThreeDivi3 td=new ThreeDivi3();
	td.divi();
}
}
