package BasicPrograms_10_11_21;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	Random rd = new Random();//random object 
	int minRange=0,maxRange=9;// determineds the minimum and maximum range of integer in array
	System.out.println("Enter the Sequence length: ");
	int n=input.nextInt();//Determines the array length
	int[] arr1=new int[n];// Secret number array
	for (int i = 0; i < arr1.length; i++) {
	       arr1[i] = rd.nextInt(maxRange-minRange)+minRange; // storeing random integers in array
	       //System.out.print(arr1[i]+" ");
	      }
	int[] arr2= new int[n];// input array from user	
	char[] out=new char[n];// Output char array base input array
	char[] expec= new char[n];// this char array is used to compare the oup char array to get expected result
	for(int i =0;i<expec.length;i++){// expected charc array from result
			expec[i]='C';
			}
	while(true){//------------------>test loop begin
		System.out.println("Enter the guess Sequence of "+n+" integers:");
		for(int i=0;i<out.length;i++) {
		out[i]= getValueDefault();// to load default value as X in result
		}	
			for(int i=0;i<arr2.length;i++) {//to get input array from the user
				arr2[i]=getvalue(i);	
					}		
			for (int i=0;i<arr1.length;i++) {//secret number array is compared with given input array
				
				for(int j=0;j<arr2.length;j++) {
					
					 if(arr1[i]==arr2[j]&& i==j) {//Result returns C in the respective index if both position and value matched
				          out[j]='C';
				          break;
				        }
				        if(arr1[i]==arr2[j]&&i!=j) {//Result returns P in the respective index if value matched but positon is not same
				        	if(out[j]!='C') {
				          out[j]='P';
				        	}				          
				        }//if none of the above conditon met result remains X in the respective index
					}
				
				}//end of comparison 
	System.out.print("Entered Guess Sequence is :");//Prints entered sequence
	for(int i=0;i<arr2.length;i++) {
		
		System.out.print(arr2[i]+" ");
					
			}	
	System.out.println();//for spacing

	for(int i=0;i<out.length;i++) {//Prints output char array
		System.out.print(out[i]+" ");
		
		}
		System.out.println();//For spacing
		

		if(Arrays.equals(out, expec)) {//if out put matches with expecte game is completed
			System.out.println("***************You Win*******************");
			break;
		}

		System.out.println("Try Again.........");//if guess is wrong Try again is printed


		}//------------>end of While loop
				
		
	}	

private static char getValueDefault() {
	return 'X';
}

private static int getvalue(int i) {
	Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    return x;

	}
    
}
/*
Enter the Sequence length: 
3
Enter the guess Sequence of 3 integers:
2
3
1
Entered Guess Sequence is :2 3 1 
X X X 
Try Again.........
Enter the guess Sequence of 3 integers:
2
3
4
Entered Guess Sequence is :2 3 4 
X X P 
Try Again.........
Enter the guess Sequence of 3 integers:
4
3
5
Entered Guess Sequence is :4 3 5 
C X P 
Try Again.........
Enter the guess Sequence of 3 integers:
4
5
6
Entered Guess Sequence is :4 5 6 
C C C 
***************You Win*******************

*/