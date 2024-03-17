package StringMethos_2;

public class Trim3 {
public static void main(String[] args) {
	 String s1 ="  hello java string   ";    
     System.out.println(s1.length());    
     System.out.println(s1); //Without trim()    
     String tr = s1.trim();    
     System.out.println(tr.length());    
     System.out.println(tr); //With trim()
}
}
/*
22
  hello java string   
17
hello java string
*/