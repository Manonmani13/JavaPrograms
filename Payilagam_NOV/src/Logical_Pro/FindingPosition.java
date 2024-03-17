package Logical_Pro;

import java.util.Scanner;

public class FindingPosition {
public static void main(String[] args) {
	//5) Finding index of given number
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the length of an array :");
    int length=sc.nextInt();
    int[] array=new int[length];
    System.out.println("Enter the elemnets :");
    for(int i=0;i<array.length;i++) { 
      
      array[i]=sc.nextInt();
    }
    for(int i=0;i<array.length;i++) { 
      System.out.print(array[i]+" ");
      
    }
    System.out.println("enter the number ");
    int find=sc.nextInt();
    int position=0;
    boolean flag=false;
    for(int i=0;i<array.length;i++) { 
      if(find==array[i]) { 
        position=i;
        flag=true;
      }
    }
    if(flag==true) { 
      System.out.println("Index of given number "+find+" is "+(position)+" position" ) ;
    }
    else { 
      System.out.println("The  number not present the array "+find ) ;
    }
    
}
}
/*
Enter the length of an array :
3
Enter the elemnets :
4
5
3
4 5 3 enter the number 
5
Index of given number 5 is 1 position


*/