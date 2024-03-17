package BasicPrograms_10_11_21;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Exception_Ex6 {
public static void main(String[] args) {
Exception_Ex6 e=new Exception_Ex6();
try {
	e.FileRead();
} catch (IOException e1) {
	
	e1.printStackTrace();
	System.out.println("check file location");
}
}
public void FileRead() throws IOException
{
	File f=new File("");
	FileWriter fw=new FileWriter(f);
	
}
}
/*
java.io.FileNotFoundException:  (No such file or directory)
	at java.base/java.io.FileOutputStream.open0(Native Method)
	at java.base/java.io.FileOutputStream.open(FileOutputStream.java:298)
	at java.base/java.io.FileOutputStream.<init>(FileOutputStream.java:237)
	at java.base/java.io.FileOutputStream.<init>(FileOutputStream.java:187)
	at java.base/java.io.FileWriter.<init>(FileWriter.java:96)
	at BasicPrograms_10_11_21.Exception_Ex6.FileRead(Exception_Ex6.java:21)
	at BasicPrograms_10_11_21.Exception_Ex6.main(Exception_Ex6.java:11)
check file location

*/