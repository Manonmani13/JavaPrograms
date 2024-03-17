package BasicPrograms_10_11_21;

public class Try7 {
    public static void main(String[] args) {  
        try  
        {  
        int data=50/0; //may throw exception   
  
        }  
            // try to handle the ArithmeticException using ArrayIndexOutOfBoundsException  
        catch(ArrayIndexOutOfBoundsException e)  
        {  
            System.out.println(e);  
        }  
        System.out.println("rest of the code");  
    }  
}
/*
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at BasicPrograms_10_11_21.Try7.main(Try7.java:7)

*/