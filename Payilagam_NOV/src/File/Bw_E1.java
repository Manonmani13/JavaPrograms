package File;

import java.io.*;

public class Bw_E1 {
public static void main(String[] args) throws IOException {
	File f = new File("/home/manon/Documents/File/Example.txt");
    
	  FileWriter fw=new FileWriter(f);
		fw.write("hello \tall  from\n manonmani ");
		fw.write(100);
		fw.write("200\n");
    
    BufferedWriter writer = new BufferedWriter(fw);
    writer.write("hello \tall  from\n manonmani ");
	writer.write(100);
	writer.write("200\n");
	fw.flush();
	fw.close();
    //      d writer.write("\t"); writer.write("\n"); 
    writer.flush();
    writer.close();
}
}
/*
hello 	all  from
 manonmani d200
*/