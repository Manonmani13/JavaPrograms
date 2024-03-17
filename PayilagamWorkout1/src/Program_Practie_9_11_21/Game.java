package Program_Practie_9_11_21;
import java.util.Random;
import java.util.Scanner;
public class Game {
		int length,i;
		int unknownNumber1,myNumber1;
	Scanner sc=new Scanner(System.in);

		public static void main(String[] args) {
			Game obj=new Game();
			obj.insertInArray(obj.unknownNumber(),obj.myNumber());
			}
		
		void insertInArray(int unknownNumber,int myNumber){
			unknownNumber1=unknownNumber;
			myNumber1=myNumber;		// inserting the value for compare in compare method
			int unknownNumberArray[]=new int[length];
			int myNumberArray[]=new int[length];
			for(i=length-1;i>=0;i--){		//i start from reverse because reminder start from last number
			unknownNumberArray[i]=unknownNumber%10;
			unknownNumber =unknownNumber/10;
					myNumberArray[i]=myNumber%10;
					myNumber=myNumber/10;}
			compare(unknownNumberArray,myNumberArray);}
		
		void compare(int[] unknownNumberArray,int[] myNumberArray){			//to compare the unknown number and given my number

			for(i=0;i<length;i++){
				int count=0;
				if(unknownNumberArray[i]==myNumberArray[i]){
					System.out.print("c");
					unknownNumberArray[i]=-1;
					continue;
				}
				for(int j=0;j<length;j++){
					if(myNumberArray[i]==unknownNumberArray[j]){
						System.out.print("p");
						unknownNumberArray[j]=-1;
						break;
					}else{
						count++;
					}}if(count==length){
						System.out.print("x");}}
			System.out.println();
			if(unknownNumber1!=myNumber1){
		System.out.print("enter the number for try again: ");
		myNumber1=sc.nextInt();
		insertInArray(unknownNumber1, myNumber1);
		}else{System.out.print("victory");}
			}
		
		int unknownNumber(){							//creating code for unknown Number
			System.out.print("enter min value range: ");
			int min=sc.nextInt();
			System.out.print("enter max value range: ");
			int max=sc.nextInt();
			int unknownNumber=new Random().ints(min, max).findFirst().getAsInt();
			length =String.valueOf(unknownNumber).length();
			
			return unknownNumber;
		}
		int myNumber(){								//creating way for my number
			System.out.print("enter your number: ");
			int myNumber=sc.nextInt();
			return myNumber;
		}}
	
			


