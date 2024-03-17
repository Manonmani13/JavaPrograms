package example;

public class ShiftedArray {
public static void main(String[] args) {
	int a[]= {2,3,4,5,6};
	int n=3;
	for(int i=n;i<a.length;i++) {
		System.out.print(a[i]);
	}
	for(int j=0;j<n;j++) {
		System.out.print(a[j]);
	}
	
}
}
