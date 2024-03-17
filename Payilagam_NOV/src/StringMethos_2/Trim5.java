package StringMethos_2;

public class Trim5 {
	public static void main(String argvs[])  
	{  
	  
	// the string contains white spaces  
	// therefore, trimming the spaces leads to the  
	// generation of new string  
	String str = " abc ";  
	  
	// str1 stores a new string   
	String str1 = str.trim();  
	  
	// the hashcode of str and str1 is different  
	System.out.println(str.hashCode());  
	System.out.println(str1.hashCode() + "\n");  
	  
	// no white space present in the string s  
	// therefore, the reference of the s is returned   
	// when the trim() method is invoked  
	String s = "xyz";  
	String s1 = s.trim();  
	  
	// the hashcode of s and s1 is the same  
	System.out.println(s.hashCode());  
	System.out.println(s1.hashCode());  
	  
	}  
}
/*
32539678
96354

119193
119193
*/