package Practice11_10_2021;

public class Num70_68_64_62 {
public static void main(String[] args) {
	int i=70,j,c=1;
	
	while(c<4)
	{
		System.out.println(i);
		i=i-2;
		if(c==3)
		{
			break;
		}
		System.out.println(i);
		j=i-4;
		i=j;
		c++;
	}
}
}
