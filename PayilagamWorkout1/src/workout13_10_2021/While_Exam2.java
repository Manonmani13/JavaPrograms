package workout13_10_2021;

public class While_Exam2 {
public static void main(String[] args) {
	int i=1,j=5;
	while(i<=5)
	{
		System.out.print(i);
		
		if(i==5)
		{
			break;
		}
		i++;
		System.out.print("*");
	}
	System.out.println();
	System.out.println("reverse");
	while(j>=1)
	{
		System.out.print(j);
		j--;
		if(j==5)
		{
			break;
		}
		System.out.print("*");
	}
}

}
