package StringMethos_2;

public class Substring4 {
	public boolean isPalindrome(String str)  //madam
	{  
	int size = str.length();  //4
	  
	// handling the base case  
	if(size == 0 || size == 1)  
	{  
	// an empty string   
	// or a string of only one character   
	// is always a palindrome  
	return true;  
	}  
	String f = str.substring(0, 1);//m m  
	String l = str.substring(size - 1); //3 
	// comparing first and the last character of the string  
	if(l.equals(f))  
	{  
	// recursively finding the solution using the substring() method  
	// reducing the number of characters of the by 2 for the next recursion  
	return isPalindrome(str.substring(1, size - 1));  
	}  
	return false;  
	}  
	// main method  
	public static void main(String argvs[])  
	{  
	// instantiating the class SubstringExample4   
	Substring4 obj = new Substring4();  
	String str[] =  
	{  
	"madam",  
	"rock",  
	"eye",  
	"noon",  
	"kill"  
	};  
	int size = str.length;  //4
	  
	for(int j = 0; j < size; j++)  
	{  
	if(obj.isPalindrome(str[j]))  //0
	{  
	System.out.println(str[j] + " is a palindrome.");  
	}  
	else  
	{  
	System.out.println(str[j] + " is not a palindrome.");  
	}  
	}  
	} 
}
/*
madam is a palindrome.
rock is not a palindrome.
eye is a palindrome.
noon is a palindrome.
kill is not a palindrome.


*/