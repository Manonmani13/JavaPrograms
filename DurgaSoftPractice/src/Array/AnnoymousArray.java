package Array;

public class AnnoymousArray {
public static void main(String args[]) {
	sum(new int[] {10,20,30,40});
	//new int[9] {10,20,30};
}
public static void sum(int[] x) {
	int total=0;
	for(int x1:x) {
		total+=x1;
		
	}
	System.out.println("The sum"+total);
}
}
