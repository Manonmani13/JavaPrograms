package example;

public class CopyArray {
public static void main(String[] args) {
	int array[]= {1,2,3,4,5};
	int array2[]=new int[5];
	for(int i=0;i<5;i++)
	{
		array2[i]=array[i];
	}
	for(int j=0;j<5;j++)
	{
		System.out.println(array2[j]);
	}
}
}
