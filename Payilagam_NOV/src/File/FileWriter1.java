package File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter1 {
public static void main(String[] args) throws IOException {
	File f=new File("/home/manon/Documents/File/Example.txt");
	f.createNewFile();//create new file
	FileWriter fw=new FileWriter(f);
	fw.write("hello all  from manonmani ");
	fw.write(100);
	fw.write("200");
	fw.flush();
	fw.close();
}
}
//hello all   d