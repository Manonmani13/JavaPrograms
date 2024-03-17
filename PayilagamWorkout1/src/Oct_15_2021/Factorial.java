package Oct_15_2021;

public class Factorial {
public static void main(String[] args) {
	int i=1,fact=1,n=5;
	while(i<=n)
	{
		fact=i*fact;
	i++;
	}
	System.out.println(fact);
}
}
