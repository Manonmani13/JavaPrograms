package Oct_17_10_2021;

public class Series13 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Series13 s= new Series13();
		s.series();
	}

	public void series() {
		// TODO Auto-generated method stub
		//201 202 204 207 211
		int n=201,i=1;
		while (i<=5) {
			System.out.print(n+" ");
			n=n+i;
			i++;
		}
}
}
