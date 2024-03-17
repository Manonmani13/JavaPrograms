package javatutorial;

public class UnaryOperatotr3 {
	public static void main(String args[]){  
		int a=10;  
		int b=-10;  
		boolean c=true;  
		boolean d=false;        // 8 4 2 1
		//1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32
//10->    0 0 0 0 0 0 0 0 0  0  0  0  0  0 0   0  0  0  0  0  0  0  0  0 0   0  0  0  1  0  1 0
		//1 1 1 1 1 1 1 1 1  1  1  1  1  1  1  1  1  1  1  1  1  1  1  1  1  1  1  1  0  1  0 1
		
		System.out.println(~a);//-11 (minus of total positive value which starts from 0)  
		System.out.println(~b);//9 (positive of total minus, positive starts from 0)  
		System.out.println(!c);//false (opposite of boolean value)  
		System.out.println(!d);//true  
		}
}
