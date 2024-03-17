package File;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FR_e2 {
	public static void main(String[] args) throws IOException {
		File f=new File("/home/manon/Documents/File/Example.txt");
	//create new file
		FileWriter fw=new FileWriter(f,true);
		fw.write("hello \tall  from\n manonmani ");
		fw.write(100);
		fw.write("200\n");
		fw.flush();
		fw.close();
		FileReader r=new FileReader(f);
		int value =r.read();
		int count=0;
		while(value!=-1)
		{
			System.out.print((char)(value)+" ");
			value=r.read();
			count++;		
		}
		System.out.println(count);
	}
}
/*
h e l l o   a l l     f r o m   m a n o n m a n i   d 2 0 0 h e l l o   a l l     f r o m   m a n o n m a n i   d 2 0 0 h e l l o   	 a l l     f r o m 
   m a n o n m a n i   d 2 0 0 h e l l o   	 a l l     f r o m 
   m a n o n m a n i   d 2 0 0 h e l l o   	 a l l     f r o m 
   m a n o n m a n i   d 2 0 0 h e l l o   	 a l l     f r o m 
   m a n o n m a n i   d 2 0 0 h e l l o   	 a l l     f r o m 
   m a n o n m a n i   d 2 0 0 h e l l o   	 a l l     f r o m 
   m a n o n m a n i   d 2 0 0 h e l l o   	 a l l     f r o m 
   m a n o n m a n i   d 2 0 0 h e l l o   	 a l l     f r o m 
   m a n o n m a n i   d 2 0 0 
 h e l l o   	 a l l     f r o m 
   m a n o n m a n i   d 2 0 0 
 h e l l o   	 a l l     f r o m 
   m a n o n m a n i   d 2 0 0 
 h e l l o   	 a l l     f r o m 
   m a n o n m a n i   d 2 0 0 
 416

*/