package DoWhile_Demos;

public class ThreeAdd {
int no=1;
void three()
{
	do
	{
		System.out.println(no);
		no=no+3;
	}while(no<=13);
}
public static void main(String[] args) {
	ThreeAdd ad=new ThreeAdd();
	ad.three();
}
}
