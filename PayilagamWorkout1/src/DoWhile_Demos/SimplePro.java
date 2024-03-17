package DoWhile_Demos;



public class SimplePro {
	int i=1;
void count()
{
	do
	{
		System.out.println(i);
		i++;
	}while(i<5);
}
public static void main(String[] args) {
	SimplePro s=new SimplePro();
	s.count();
}
}
