package Programs_11_11_21;

import java.util.Random;
import java.util.Scanner;

public class Game {
	  int length;

	  public static void main(String[] args) {
	    Game obj = new Game();
	    int[] arr1 = obj.getRandomNo(0, 9);
	    obj.checkNo(arr1);

	  }

	  private char[] findPosition(int arr1[], int arr2[]) {
	    // TODO Auto-generated method stub
	    char[] arr3 = new char[arr1.length];

	    for (int i = 0; i < arr1.length; i++) {

	      if (arr1[i] == arr2[i]) {
	        arr3[i] = 'c';
	      } else {
	        arr3[i] = 'x';
	      }
	      for (int j = 0; j < arr3.length; j++) {
	        if (arr2[i] == arr1[j] && arr3[i] != 'c') {
	          arr3[i] = 'p';
	        }
	      }
	    }

	    for (int i = 0; i < arr3.length; i++) {
	      System.out.print(arr3[i]);
	    }
	    System.out.println();

	    for (int i = 0; i < arr3.length; i++) {
	      if (arr3[i] == 'x' || arr3[i] == 'p') {
	        System.out.println("Sorry! Try Again");
	        System.out.println();
	        break;
	      }
	    }
	    return arr3;

	  }

	  private void checkNo(int[] arr1) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter " + length + " Digits Number" + " You Think What is Random No");
	    int[] arr2 = new int[arr1.length];

	    for (int i = 0; i < arr2.length; i++) {
	      arr2[i] = sc.nextInt();
	    }
	    System.out.println("Entered No for Checking is: ");
	    for (int i = 0; i < arr2.length; i++) {
	      System.out.print(arr2[i]);
	    }
	    System.out.println();

	    while (true) {
	      char[] arr3 = findPosition(arr1, arr2);
	      int space = 0;
	      for (int i = 0; i < arr3.length; i++) {
	        if (arr3[i] == 'c') {
	          space++;
	        }
	      }
	      if (space == length) {
	        System.out.println("Congrates!!! You Beauty Found out Hidden Number");
	        break;
	      } else {
	        System.out.println("Re-Enter P & X Positions");
	        for (int i = 0; i < arr2.length; i++) {
	          arr2[i] = sc.nextInt();
	        }
	        System.out.println("Entered No for Checking is:");
	        for (int i = 0; i < arr2.length; i++) {
	          System.out.print(arr2[i]);
	        }
	      }
	    }
	  }

	  private int[] getRandomNo(int minRange, int maxRange) {
	    Scanner sc = new Scanner(System.in);
	    Random rm = new Random();
	    System.out.println("Enter the positive number length");
	    length = sc.nextInt();//3
	    int arr1[] = new int[length];

	    for (int i = 0; i < arr1.length; i++) {
	      arr1[i] = rm.nextInt(maxRange - minRange) + minRange;
	    }

//	    for (int i = 0; i < arr1.length; i++) {
//	      System.out.print(arr1[i]);
//	    }
//	    System.out.println();
	    System.out.println();
	    return arr1;
	  }
}
/*
Enter the positive number length
3

Enter 3 Digits Number You Think What is Random No
1
2
3
Entered No for Checking is: 
123
xxx
Sorry! Try Again

Re-Enter P & X Positions
4
5
6
Entered No for Checking is:
456xxc
Sorry! Try Again

Re-Enter P & X Positions
7
8
6
Entered No for Checking is:
786xxc
Sorry! Try Again

Re-Enter P & X Positions
9
0
6
Entered No for Checking is:
906xcc
Sorry! Try Again

Re-Enter P & X Positions
8
0
6
Entered No for Checking is:
806xcc
Sorry! Try Again

Re-Enter P & X Positions
7
0
6
Entered No for Checking is:
706xcc
Sorry! Try Again

Re-Enter P & X Positions
6
0
6
Entered No for Checking is:
606pcc
Sorry! Try Again

Re-Enter P & X Positions
5
0
6
Entered No for Checking is:
506xcc
Sorry! Try Again

Re-Enter P & X Positions
4
0
6
Entered No for Checking is:
406xcc
Sorry! Try Again

Re-Enter P & X Positions
3
0
6
Entered No for Checking is:
306xcc
Sorry! Try Again

Re-Enter P & X Positions
2
0
6
Entered No for Checking is:
206xcc
Sorry! Try Again

Re-Enter P & X Positions
1
0
6
Entered No for Checking is:
106xcc
Sorry! Try Again

Re-Enter P & X Positions
0
06
6
Entered No for Checking is:
066cpc
Sorry! Try Again

Re-Enter P & X Positions
0
0
6
Entered No for Checking is:
006ccc
Congrates!!! You Beauty Found out Hidden Number


*/