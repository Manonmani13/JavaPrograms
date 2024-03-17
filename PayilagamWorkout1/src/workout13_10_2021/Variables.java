package workout13_10_2021;

public class Variables {
	static int m=100;//static variable  
    void method()  
    {    
        int n=90;//   
        System.out.println("local variable "+n);
    }  
  
    public static void main(String[] args) {
		Variables v=new Variables();
		System.out.println("sttic variable"+m);
		v.method();
		int data=50;//
        System.out.println("instance variable   "+data);
	
		
	}
}
