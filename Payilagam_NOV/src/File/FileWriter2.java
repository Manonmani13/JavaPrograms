package File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter2 {
	public static void main(String[] args) throws IOException {
		File f=new File("/home/manon/Documents/File/Example.txt");
		f.createNewFile();//create new file
		FileWriter fw=new FileWriter(f,true);
		fw.write("hello \tall  from\n manonmani ");
		fw.write(100);
		fw.write("200");
		fw.flush();
		fw.close();
	}
}
//hello all  from manonmani d200hello all  from manonmani d200