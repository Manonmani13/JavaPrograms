package Oct_15_2021;

public class PrimeNo {
	public static void main(String[] args) {
		

	for(int i=2;i<=20;i++)    
    {  
    int count = 0;
      for(int j=1;j<=i;j++) {
        int k = i%j;
           if(k==0) {
         count=count+1;                          
     }
         
      }
      if(count==2) {
           System.out.println(i + " is prime no");
  }  
	}
}
}
