package StringMethods;

public class GetByte {
public static void main(String[] args) {
	String s="ABDEFG";
	byte[] bt=s.getBytes();
	for(int i=0;i<bt.length;i++)
	{
		System.out.println(bt[i]);
	}
}
}
/*
65
66
68
69
70
71

*/