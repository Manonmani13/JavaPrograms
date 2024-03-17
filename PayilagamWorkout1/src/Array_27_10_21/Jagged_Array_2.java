package Array_27_10_21;

public class Jagged_Array_2 {

	public static void main(String[] args) 
    { 
        int r = 5;  
        int arr[][] = new int[r][];  
        for (int i=0; i<arr.length; i++) 
            arr[i] = new int[i+1];
        int count = 0; 
        for (int i=0; i<arr.length; i++) 
            for(int j=0; j<arr[i].length; j++) 
                arr[i][j]=count++; 
        System.out.println("Contents of 2D Jagged Array"); 
        for (int i=0; i<arr.length; i++) 
        { 
            for (int j=0; j<arr[i].length; j++) 
                System.out.print(arr[i][j] + " "); 
            System.out.println(); 
        } 
    } 
}
/*
Contents of 2D Jagged Array
0 
1 2 
3 4 5 
6 7 8 9 
10 11 12 13 14 
*/
