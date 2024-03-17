package File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BRE {
public static void main(String[] args) throws IOException {
	File f = new File("/home/manon/Documents/File/Example.txt");
    
	  FileWriter fw=new FileWriter(f);
		fw.write("hello \tall  from\n manonmani ");
		fw.write(100);
		fw.write("200\n");
		fw.close();
		FileReader r=new FileReader(f);
		
		BufferedReader breader = new BufferedReader(r);
		  String value = breader.readLine();//-1
		  int count =0; 
		  while(!value.equals(null))
		  {
		    System.out.print(value);
		    value = breader.readLine();
		    count++;
		  }
		  System.out.println(count);
}
}
/*
hello 	all  from manonmani d200Exception in thread "main" java.lang.NullPointerException
	at File.BRE.main(BRE.java:23)

*/