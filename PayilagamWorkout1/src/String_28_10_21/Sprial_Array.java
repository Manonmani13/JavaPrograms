package String_28_10_21;

import java.util.Scanner;

public class Sprial_Array {
	static void printSpiralPattern(int size)  
	{   
	int row = 0, col = 0;  
	int boundary = size - 1;  
	int sizeLeft = size - 1;  
	int flag = 1;  
	//variables r, l, u and d are used to determine the movement  
	// r = right, l = left, d = down, u = upper  
	char move = 'r';  
	//creating a 2D array for matrix  
	int[][] matrix =new int [size][size];  
	for (int i = 1; i < size * size + 1; i++)  
	{  
	    //assigning values  
	    matrix[row][col] = i;  
	//switch-case to determine the next index  
	switch (move)  
	{  
	//if right, go right  
	case 'r':  
	    col += 1;  
	    break;  
	//if left, go left  
	case 'l':  
	    col -= 1;  
	    break;  
	//if up, go up  
	case 'u':  
	    row -= 1;  
	    break;  
	//if down, go down  
	case 'd':  
	    row += 1;  
	    break;  
	}    
	if (i == boundary)  
	    {    
	        boundary = boundary + sizeLeft;  
	        if (flag != 2)  
	        {  
	        flag = 2;  
	        }  
	        else  
	        {  
	        flag = 1;  
	        sizeLeft -= 1;  
	        }  
	        switch (move)  
	        {   
	        case 'r':  
	            move = 'd';  
	            break;    
	        case 'd':  
	            move = 'l';  
	            break;  
	        case 'l':  
	            move = 'u';  
	            break;   
	        case 'u':  
	            move = 'r';  
	            break;  
	        }  
	    }  
	    }    
	    for (row = 0; row < size; row++)  
	    {   
	        for (col = 0; col < size; col++)  
	            {  
	                int n = matrix[row][col];  
	                if(n < 10)  
	                    System.out.print(n +" ");  
	                else  
	                    System.out.print(n +" ");  
	            }  
	        System.out.println();  
	    }  
	}    
	public static void main(String args[])  
	{  
		Scanner s=new Scanner(System.in);
	int size =s.nextInt();  
	System.out.println("Spiral Matrix or Pattern is: \n");  
	printSpiralPattern(size);  
	}  
}
/*
Spiral Matrix or Pattern is: 

1 2 3 4 5 
16 17 18 19 6 
15 24 25 20 7 
14 23 22 21 8 
13 12 11 10 9 


*/