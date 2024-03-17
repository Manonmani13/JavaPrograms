package Programs_11_11_21;

public class Patter42 {
public static void main(String[] args) {
	for(int i=0;i<5;i++)
	{
		int k=1;
		for(int j=0;j<=i;j++)
		{
			System.out.print(k+j);
			k++;
		}
		System.out.println();
	}
}
}
/*

1
13
135
1357
13579*/