package Oct_17_10_2021;

public class Series7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Series7 s=new Series7();
		s.prac_13_25_51_101_203();

	}

	public void prac_13_25_51_101_203() {
		// TODO Auto-generated method stub
		//13 25 51 101 203
		int n=13;
		while (n<=203) {
			System.out.print(n+" ");
			n=(n*2)-1;
			if (n>203) {
				break;
			}
			System.out.print(n+" ");
			n=(n*2)+1;
		}
	}
}
