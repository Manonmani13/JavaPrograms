package File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class INSt {
public static void main(String[] args) throws IOException {
	File f=new File("/home/manon/Documents/File/nature.jpeg");
	InputStream input = new FileInputStream(f);
	  
	  OutputStream output = new FileOutputStream("/home/manon/Documents/File/natureLocation.jpeg");
	  int value = input.read();
	  while(value!=-1)
	  {
	    output.write(value);
	    value = input.read();
	  }
	  output.flush();
	  output.close();
}
}
