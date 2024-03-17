package Array_27_10_21;

public class Jagged_Array_3 {
	public static void main(String[] args)
    {
        int arr[][] = new int[2][];
        arr[0] = new int[3]; 
        arr[1] = new int[2];
        int count = 0;
        for (int i=0; i<arr.length; i++)
            for(int j=0; j<arr[i].length; j++)
                arr[i][j] = count++;
 
        // Displaying the values of 2D Jagged array
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
0 1 2 
3 4 
*/
