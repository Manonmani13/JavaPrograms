package Practice8_10_2021;

public class SixTable {
int j=1;
void tab()
{
	while(j<=60)
	{
		if(j%6==0)
		{
			System.out.println(j);
		}
		j++;
	}
}
public static void main(String[] args) {
	SixTable s=new SixTable();
	s.tab();
}
}
