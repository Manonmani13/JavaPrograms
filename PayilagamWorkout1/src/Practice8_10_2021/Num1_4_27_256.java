package Practice8_10_2021;

public class Num1_4_27_256 {
int i=1,c=0;
public void pow()
{
	while(i<=4)
	{
		c++;
		if(c==2)
			System.out.println(i*i);
		else if(c==3)
			System.out.println(i*i*i);
		else if(c==4)
			System.out.println(i*i*i*i);
		else
			System.out.println(i);
		i++;
	}
}
public static void main(String[] args) {
	Num1_4_27_256 n=new Num1_4_27_256();
	n.pow();
}
}
