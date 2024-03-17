package BasicPrograms_10_11_21;

import java.io.IOException;

public class Exeption_ex6 {
public static void main(String[] args) throws IOException {
	
	Exception_Ex6 e=new Exception_Ex6();
	e.FileRead();
	/*try {
		e.FileRead();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		//e1.printStackTrace();
		System.out.println("check file location");
	}*/
}
}
/*
Exception in thread "main" java.io.FileNotFoundException:  (No such file or directory)
	at java.base/java.io.FileOutputStream.open0(Native Method)
	at java.base/java.io.FileOutputStream.open(FileOutputStream.java:298)
	at java.base/java.io.FileOutputStream.<init>(FileOutputStream.java:237)
	at java.base/java.io.FileOutputStream.<init>(FileOutputStream.java:187)
	at java.base/java.io.FileWriter.<init>(FileWriter.java:96)
	at BasicPrograms_10_11_21.Exception_Ex6.FileRead(Exception_Ex6.java:21)
	at BasicPrograms_10_11_21.Exeption_ex6.main(Exeption_ex6.java:9)

*/