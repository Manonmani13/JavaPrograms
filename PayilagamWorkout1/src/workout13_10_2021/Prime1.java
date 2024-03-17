package workout13_10_2021;

public class Prime1 {
	public static void main(String[] args) {

		
		int limit = 200;
		
		System.out.println("Printing prime numbers!");
		for (int num = 2; num <= limit; num++) {
			
			if (isPrimeNumber(num)) {
				System.out.println(num);
			}
		}
	}
	
		public static boolean isPrimeNumber(int num) {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					return false; 
				}
			}
			return true;
		}
}
	
