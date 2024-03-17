package Oct_17_10_2021;

public class Series11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Series11 s=new Series11();
		s.Series();
	}

	public void Series() {
		// TODO Auto-generated method stub
		//5.2 4.8 4.4 4 3.6
		 float n=5.2f,count=0;
		 while (count<5) {
			 System.out.print(String.format("%.1f",n)+" ");
				n=n-0.4f;
				count++;
		}
}
}
