package Workout10_19_2021;

public class Num2_3_5_7_11_13_17_23_29 {
	public static void main(String[] args) {
		prime_Number();
	}
	 public static void prime_Number() {
		    
		    //2_3_5_7_11_13_17_19_23_29
		    int n=3,i1=2,tot=15;
		    
		    System.out.print(2+" ");
		    while (n<tot) {
		      int i=2;
		      boolean prime=true;
		      while (i<n) {
		        if(n%i==0) { 
		          //System.out.println("no prime");
		          prime=false;
		          break;
		          
		        }
		        i++;
		      }
		      
		      /*if(prime==false) { 
		        System.out.println(n+" Not RIME NUMBER");
		      }
		      else {
		        System.out.println(n+" PRIME NUMNBER");
		      }*/
		      if(prime==false) { 
		        //System.out.println(n+" Not RIME NUMBER");
		      }
		      else {
		        System.out.print(n+" ");
		      }
		      n++;
		    }
		    
	 }
}
