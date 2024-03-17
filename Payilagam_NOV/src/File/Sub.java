package File;

import java.io.File;

public class Sub {
public static void main(String[] args) {
	File f=new File("/home/manon/Documents/File/Example");
	boolean b=f.mkdir();
	System.out.println(b);
}
}
