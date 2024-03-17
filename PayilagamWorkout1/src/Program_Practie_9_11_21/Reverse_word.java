package Program_Practie_9_11_21;

public class Reverse_word {
public static void main(String[] args) {
	String s[]="manonmani pandukumar".split(" ");
    String s1="";
    for(int i=s.length-1;i>=0;i--) { 
      s1+=s[i]+" ";
    }
    System.out.println("Reverse "+s1);
}
}
