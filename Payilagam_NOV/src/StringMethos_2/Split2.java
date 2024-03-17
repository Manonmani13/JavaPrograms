package StringMethos_2;

public class Split2 {
public static void main(String[] args) {
	String s="manonmani pandukumar";
	//System.out.println(s.split(" "));
	String w[]=s.split("\\s");
	for(String s1:w)
	{
		System.out.println(s1);
		
	}
}
}
/*
manonmani
pandukumar

*/