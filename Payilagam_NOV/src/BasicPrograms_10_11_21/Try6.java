package BasicPrograms_10_11_21;

public class Try6 {
public static void main(String[] args) {
	 try  
     {  
     int data1=50/0; //may throw exception   

     }  
          // handling the exception  
     catch(Exception e)  
     {  
         // generating the exception in catch block  
     int data2=50/0; //may throw exception   

     }  
 System.out.println("rest of the code");  

}
}
/*
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at BasicPrograms_10_11_21.Try6.main(Try6.java:14)

*/