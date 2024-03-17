package Practice11_10_2021;

public class Num60_60_57_57_57 {
public static void main(String[] args) {
	int i=2,j=60,k;
	do
	{
		/*while(k<=i)
		{
			System.out.println(j);
			k++;
		}*/
		for(k=1;k<=i;k++)
		{
			System.out.println(j);
			
		}
		
		i++;
		j=j-i;
	
	}while(i<=5);
}
}
