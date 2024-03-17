package Practice8_10_2021;

public class FourTable {
int i=1;
void four()
{
	while(i<=16)
	{
		if(i%4==0)
		{
			System.out.println(i);
		}
		i++;
	}
}
public static void main(String[] args) {
	FourTable f=new FourTable();
	f.four();
}
}
