package LogicalPrograms_25_10_2021;

public class Reverse_String {
	public static void main(String[] args) {
		String lang="mad";//dam
		String rev="";
		int len=lang.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+lang.charAt(i);
		}
		System.out.println(rev);
	}
}
