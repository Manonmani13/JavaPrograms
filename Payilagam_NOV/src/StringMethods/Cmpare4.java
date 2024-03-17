package StringMethods;

import java.util.ArrayList;
import java.util.Collections;

public class Cmpare4 {
	public static void main(String[] args)   
	{  
	   
	Players ronaldo = new Players("Ronaldo");  
	Players sachin = new Players("Sachin");  
	Players messi = new Players("Messi");  
	ArrayList<Players> al = new ArrayList<>();  
	  
	al.add(ronaldo);  
	al.add(sachin);  
	al.add(messi);  
	   
	// performing binary search on the list al  
	Collections.binarySearch(al, "Sehwag", null);  
	}  
}
class Players   
{  
       
private String name;  
  
// constructor of the class  
public Players(String str)  
{  
name = str;  
}  
   
}  
