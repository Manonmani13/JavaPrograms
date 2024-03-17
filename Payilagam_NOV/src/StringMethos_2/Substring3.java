package StringMethos_2;

public class Substring3 {
	public static void main(String argvs[])  
	{  
	String str[] =  
	{  
	"Praveen Kumar",  
	"Yuvraj Singh",  
	"Harbhajan Singh",  
	"Gurjit Singh",  
	"Virat Kohli",  
	"Rohit Sharma",  
	"Sandeep Singh",  
	"Milkha Singh"  
	};  
	  
	String surName = "Singh";  
	int surNameSize = surName.length();  //4
	  
	int size = str.length; //8 
	  
	for(int j = 0; j < size; j++)  
	{  
	    int length = str[j].length();  //0->12
	    // extracting the surname  
	    String subStr = str[j].substring(length - surNameSize);  //12-4=8
	      
	    // checks whether the surname is equal to "Singh" or not  
	    if(subStr.equals(surName))  
	    {  
	        System.out.println(str[j]);  
	    }  
	}  
	  
	}  
}
/*
 Yuvraj Singh
Harbhajan Singh
Gurjit Singh
Sandeep Singh
Milkha Singh

 */
