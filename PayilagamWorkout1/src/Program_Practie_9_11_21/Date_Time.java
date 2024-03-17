package Program_Practie_9_11_21;
import java.util.Scanner;
public class Date_Time {
	

	
		int length,details;
		Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Date_Time obj=new Date_Time();
		obj.insertData();
		
	}
	void insertData(){
		System.out.print("how many person to add: ");
		length=sc.nextInt();								//length means number of person
		details=5; 											//number of details
		String [][]document=new String[length][details];  
		for(int person=0;person<length;person++){
			for(int j=0;j<details;j++){							// j is particular person detail
				if(j==0){System.out.print("Name: ");}
				else if(j==1){System.out.print("Date of birth: ");}
				else if(j==2){System.out.print("Death Date: ");}
				else if(j==4){System.out.print("Role: ");}
				else if(j==3){System.out.print("Death Time: ");}
				document[person][j]=sc.next();
			
			}System.out.println();}
		search(document);
	}
	void search(String[][] document){
		int count=0;
		System.out.println("search the name: ");
		String searchName=sc.next();
		for(int i=0;i<length;i++){
		if(searchName.equals(document[i][0])){
			
			for(int j=0;j<details;j++){
				if(j==0){System.out.print("Name: ");}
				else if(j==1){System.out.print("Date of birth: ");}
				else if(j==2){System.out.print("Death Date: ");}
				else if(j==4){System.out.print("Role: ");}
				else if(j==3){System.out.print("Death Time: ");}
			System.out.print(document[i][j]);
			System.out.println();
			}
		}else{count++;}			//count and length are equal then count does not affected by any other same relation
		}if(count==length){
			System.out.print("person not found,TRY AGAIN");
			System.out.println();
			search(document);
		}else{System.out.print("enter 'ok' to search other name and press any key to exit: ");
			String again=sc.next();
			if(again.equals("ok")){
				search(document);
			}else{System.out.println("---------THANK YOU---------");}
		}
		}}
/*
how many person to add: 2
Name: manonmani
Date of birth: 13/10/21
Death Date: dont know
Death Time: Role: 12

Name: maha
Date of birth: 22.3.1967
Death Date: 30.12.5050
Death Time: 12.30

Role: clearning

search the name: 
manonmani
Name: manonmani
Date of birth: 13/10/21
Death Date: dont
Death Time: know
Role: 12
enter 'ok' to search other name and press any key to exit: 
*/