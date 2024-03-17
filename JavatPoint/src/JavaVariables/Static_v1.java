package JavaVariables;

public class Static_v1 {
	   static int m=100;//static variable  
	    void method()  
	    {    
	        int n=90;//local variable   
	        System.out.println(n);
	    }  
	    public static void main(String args[])  
	    {  
	    	Static_v1 d=new Static_v1();
	        int data=50;//instance variable  
	        System.out.println(data+" "+m);//50 100
	        d.method();//90
	    } 
	    
	   
}
