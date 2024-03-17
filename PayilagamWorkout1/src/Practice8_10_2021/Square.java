package Practice8_10_2021;

public class Square {
	int i=1,l;
	void square() {
	do
	{
		l=i*i;
		System.out.println(l);
		
		
		i++;
	}while(i<=10);

	}
	public static void main(String[] args) {
		Square s=new Square();
		s.square();
	}
}
