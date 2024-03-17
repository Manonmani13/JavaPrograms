package StringMethos_2;

public class Split1 {
public static void main(String[] args) {
	String s="hello manonmani pandukumar ";
	String[] words=s.split("\\s");
	for(String w:words){  
		System.out.println(w);  
		}  
}
}
/*
hello
manonmani
pandukumar
*/