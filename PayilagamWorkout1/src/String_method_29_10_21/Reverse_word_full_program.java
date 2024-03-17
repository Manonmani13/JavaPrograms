package String_method_29_10_21;

public class Reverse_word_full_program {
	public static void main(String[] args) {
	    
	    Reverse_word_full_program game=new Reverse_word_full_program();
	    String sen = "manonmani pandukumar";
	    String result = game.reverseWords(sen);
	    System.out.println(result);
	  }

	  private String reverseWords(String sen) { 
	    int space = 0;
	    String s1 = "", s2="";
	    for(int i=0;i<sen.length(); i++)
	      {
	      if(sen.charAt(i) == ' ')
	      {
	      s1 = reverseWord(sen,0,i-1);
	        space = i;
	      }
	      }
	    s2 = reverseWord(sen,space,sen.length()-1);
	    return s1+s2; 
	  }
	  private String reverseWord(String name,int i, int j) {
	    char[] a  = name.toCharArray();
	    while(i<j)
	    {
	    char temp = a[i]; //m
	    a[i] = a[j];   //i
	    a[j] = temp;  
	    i++;
	    j--;
	    }
	    String s = new String(a); 
	    return s; 
	  }
}
