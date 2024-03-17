package Practice9_10_2021;

public class Num1_0_0_2_3_7_3 {
//1 0 0 2 3 7 3  8
//

	void printabove() {
		int i = 1;
		int j = 1;
		while (true) {
			int k = (int) Math.pow(i, j);
			System.out.print(k + " ");
			j++;
			while (j <= 3) {
				int k1 = (int) Math.pow(i, j) - 1;
				System.out.print(k1 + " ");
				j++;
			}
			i++;
			j = 1;
			if (i == 4) {   // ----->  choice
				break;
			}

		}

	} 
	public static void main(String[] args) {
		Num1_0_0_2_3_7_3 n=new Num1_0_0_2_3_7_3();
		n.printabove();
	}
}
