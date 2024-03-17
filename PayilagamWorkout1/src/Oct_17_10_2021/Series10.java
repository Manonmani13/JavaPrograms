package Oct_17_10_2021;

public class Series10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.5 2.3 3.1 3.9 
		float n=1.5f,count=0;
		while (count<5) {
			System.out.print(String.format("%.1f",n)+" ");
			n=n+0.8f;
			count++;
		}
}
}
