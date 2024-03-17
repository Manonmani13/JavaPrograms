package Array_27_10_21;

public class Jagged_Array1 {
	 public static void main(String[] args) {

		    // declare and initialize array
		    int[][] arr = {
		                     {10,9,8},
		                     {7,5,6,88},
		                     {30,15},
		                     {50},
		                     {10,20,30,40,50}
		                   };

		    // displaying jagged array in Java
		    // using for-each loop
		    System.out.println("Jagged array is (using for-each loop):");
		    for(int[] i: arr){
		      for(int j : i){
		        System.out.printf("%d\t",j);
		      }
		      System.out.println();
		    }

		    // displaying jagged array in Java
		    // using for loop and length property
		    System.out.println("\nJagged array is (using for loop):");
		    for(int i=0; i < arr.length; i++){
		      for(int j=0; j < arr[i].length; j++){
		        System.out.printf("%d\t",arr[i][j]);
		      }
		      System.out.println();
		    }
		  }
}
/*
Jagged array is (using for loop):
10	9	8	
7	5	6	88	
30	15	
50	
10	20	30	40	50
*/