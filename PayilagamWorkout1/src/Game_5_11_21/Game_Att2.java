package Game_5_11_21;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Game_Att2 {
	

	
	  public static void main(String[] args) {
	    
	    
	    int n=4;
	    int[] arr1= {3,8,5,9};// Secret num
	    
	    int[] arr2= new int[n];// input from user
	    
	    
	    char[] expec= {'C','C','C','C'};// expected result
	   
	    while(true){//------------------>test loop begin
	      char[] out= {'X','X','X','X'};// to check print output
	    for(int i=0;i<arr2.length;i++) {
	      arr2[i]=getvalue(i);
	      
	    }
	      
	    for (int i=0;i<arr1.length;i++) {//arr1[0]=3
	      //int ind=0;z
	      
	      for(int j=0;j<arr2.length;j++) {
	        
	        if(arr1[i]==arr2[j]&& i==j) {//3==3 && po 0==0
	          out[j]='C';
	          break;
	        }
	        if(arr1[i]==arr2[j]&&i!=j) {
	          out[j]='P';
	          break;
	          
	        }  
	        }
	   
	    }//end of for 

	    for(int i=0;i<out.length;i++) {
	      System.out.print(out[i]);
	    }
	      
	  
	  if(Arrays.equals(out, expec)) {
	    break;
	  }
	  }//------------>Test loop in end   
	}  
	  private static int getvalue(int i) {
	    Scanner sc=new Scanner(System.in);
	    int x=sc.nextInt();
	    return x;
	  }

}
/*
4
1
8
9
XXPC
2
8
7
9
XCXC
3
8
4
9
CCXC
3
8
5
9
CCCC
*/