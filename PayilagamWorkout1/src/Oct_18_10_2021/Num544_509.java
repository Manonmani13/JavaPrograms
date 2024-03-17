package Oct_18_10_2021;

public class Num544_509 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Num544_509 s= new Num544_509();
		s.Series();
		
	}

	public void Series() {
		// TODO Auto-generated method stub
		//544 509 474 439 404
		int n=544,count=0;
		while (count<=4) {
			System.out.print(n+" ");
			n=n-35;
			count++;
		}
}
}
