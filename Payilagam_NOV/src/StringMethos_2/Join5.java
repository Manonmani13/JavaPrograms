package StringMethos_2;

public class Join5 {
	public static void main(String argvs[])  
	{  
	String str = null;  
	  
	// one of the element is null however it will be treated as normal string  
	str = String.join("-", null, " wake up ", " eat ", " write content for JTP ", " eat ", " sleep ");  
	System.out.println(str);  
	}  
}
//null- wake up - eat - write content for JTP - eat - sleep 
