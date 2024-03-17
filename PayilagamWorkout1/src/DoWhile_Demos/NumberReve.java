package DoWhile_Demos;

public class NumberReve {
int no=5;
void reverse()
{
	do
	{
		System.out.println(no);
		no=no-1;
	}while(no>=1);
}
public static void main(String[] args) {
	NumberReve rs=new NumberReve();
	rs.reverse();
}
}
