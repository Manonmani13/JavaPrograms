package LogicalPrograms_25_10_2021;



			public class Find_Second_highest_lowest {

			  String[] players= {"santhiya","mano","benson","murali","sathish","dhanraj"};
			  float[] time= {25.2f,23.6f,28.7f,19.2f,16.5f,30.5f};
			  static float first_rank;
			  static float last_rank;
			  

			  public static void main(String[] args) {
			    Find_Second_highest_lowest obj = new Find_Second_highest_lowest();
			    first_rank=obj.First_Rank();
			    obj.second_rank(); 
			     last_rank=obj.Last_Rank();
			     obj.Second_from_Last_Rank();
			  }

			  private void Second_from_Last_Rank() {
			    float high=0;
			    int no_of_person =0;
			     for(int i=0;i<time.length;i++) {
			       if(time[i]>high) {
			         if(last_rank==time[i]) {
			           continue;
			         }
			         else {
			         high=time[i];
			         no_of_person=i;
			         }
			       }
			     }
			     System.out.println("Second From Last Rank");
			     System.out.println(players[no_of_person]);
			     System.out.println(time[no_of_person]);
			     System.out.println();
			  
			    
			  }

			  private void second_rank() {
			    float low=Float.MAX_VALUE;
			    int no_of_person=0;
			   for(int i=0;i<time.length;i++) {
			     if(time[i]<low) {
			       if(first_rank==time[i]) {
			        
			       }else {
			       low=time[i];
			       no_of_person=i;
			     }
			       }
			   }
			   System.out.println("Second Rank : ");
			   System.out.println(players[no_of_person]);
			   System.out.println(time[no_of_person]);
			   System.out.println();
			    
			  }

			  private float Last_Rank() {
			    float high=0;
			    int no_of_person =0;
			     for(int i=0;i<time.length;i++) {
			       if(time[i]>high) {
			         high=time[i];
			         no_of_person=i;
			       }
			     }
			     System.out.println("Last Rank");
			     System.out.println(players[no_of_person]);
			     System.out.println(time[no_of_person]);
			     System.out.println();
			     return time[no_of_person];
			  }

			  private float First_Rank() {
			        //Task1 --->  Get 1st rank ---Name ans time
			    float low=Float.MAX_VALUE;
			    int no_of_person=0;
			   for(int i=0;i<time.length;i++) {
			     if(time[i]<low) {
			       low=time[i];
			       no_of_person=i;
			     }
			   }
			   System.out.println("First Rank : ");
			   System.out.println(players[no_of_person]);
			   System.out.println(time[no_of_person]);
			   System.out.println();
			    return time[no_of_person];
			  }

			}

	/*
	irst Rank : 
sathish
16.5

Second Rank : 
murali
19.2

Last Rank
dhanraj
30.5

Second From Last Rank
benson
28.7
*/
