package While_Demos;

public class SimplePro {
	int i=1;
void count()
{
	while(i<5)
	{
		System.out.println(i);
		i++;
	}
}
public static void main(String[] args) {
	SimplePro s=new SimplePro();
	s.count();
}
}
