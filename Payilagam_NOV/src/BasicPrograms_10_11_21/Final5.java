package BasicPrograms_10_11_21;

import java.io.IOException;

public class Final5 {
public static void main(String[] args) throws IOException{
	Final5 f=new Final5();
	f.method();
	System.out.println("here also we did not give handling ");
}
void method()throws IOException{
	System.out.println("welcome");
}
}
/*
welcome
here also we did not give handling 

*/