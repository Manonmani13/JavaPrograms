package Practice11_10_2021;

public class Num12_13_25 {
public static void main(String[] args) {
	int i=12,j=13,sum;
	while(i<=164)
	{
		System.out.println(i);
		sum=i+j;
		i=j;
		j=sum;
	}
}
}
