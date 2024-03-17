package File;

import java.io.File;
import java.io.IOException;

public class FileC {
public static void main(String[] args) throws IOException {
	File f=new File("/home/manon/Documents/File/Example.txt");
	f.createNewFile();//create new file
}
}
