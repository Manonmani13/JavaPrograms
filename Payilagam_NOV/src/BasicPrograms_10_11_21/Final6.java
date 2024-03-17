package BasicPrograms_10_11_21;

import java.io.IOException;

public class Final6 {
public static void main(String[] args) {
	Final6 f=new Final6();
	try {
		f.method();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
void method()throws IOException{
	throw new IOException("error");
}
}
/*
java.io.IOException: error
	at BasicPrograms_10_11_21.Final6.method(Final6.java:16)
	at BasicPrograms_10_11_21.Final6.main(Final6.java:9)

*/