package Practice_24_10_21;

public class Athe_Program {
	static String  players[]= {"Santhiya","Mano","Benson","Murali","Sathish","Dhanraj"};
	static float time[]= {25.2f,23.6f,28.4f,19.2f,16.5f,30.3f};
	String namecheck;
    int no_of_person=0,no=0;
    float sec,high=0;
     float low=Integer.MAX_VALUE;

public static void main(String[] args) {
	
	Athe_Program AP=new Athe_Program();
	AP.First_Rank(players, time);
	AP.Last_Rank(players,time);
	AP.Second_Rank(players,time);
	AP.Second_From_Last(players,time);
}
public void Second_From_Last(String[] players, float[] time) {
	// TODO Auto-generated method stub
	low=sec=Float.MIN_VALUE;
	for(int i=0;i<time.length;i++)
	{
		if(time[i]>low)
		{
			sec=low;
			no=no_of_person;
			low=time[i];
			no_of_person=i;
			
			//System.out.println(low+"\t "+sec+"\t "+  no_of_person);
		}
		else if(time[i]>sec&&time[i]!=low)
		{
			sec=time[i];
			no=i;
		}
		namecheck=players[no];
	}
	
	System.out.println("Second Rank From Last   : "+ sec+" Name Of The Person  : "+namecheck );
}

public void Second_Rank(String[] players, float[] time) {
	
	low=sec=Float.MAX_VALUE;
	for(int i=0;i<time.length;i++)
	{
		if(time[i]<low)
		{
			sec=low;
			no=no_of_person;
			low=time[i];
			no_of_person=i;
			//25.2f,23.6f,28.4f,19.2f,16.5f,30.3f
			//System.out.println(low+"\t "+sec+"\t "+  no_of_person);
		}
		namecheck=players[no];
	}
	
	System.out.println("Second Rank             : "+ sec+" Name Of The Person  : "+namecheck );
}
public void Last_Rank(String players[],float time[])
{
	String namecheck = null;
    int no_of_person=0;
    float high=0;
	for(int i=0;i<time.length;i++)
	{
		if(time[i]>high)
		{
			high= time[i];
			no_of_person=i;	
		}	
		namecheck=players[no_of_person];
		
	}
	System.out.println("Last Rank               : "+high+"  Name Of The Person : "+namecheck);

}
public void First_Rank(String players[],float time[])
{ 
	String namecheck;
    int no_of_person=0;
     float low=Integer.MAX_VALUE;
	for(int i=0;i<time.length;i++)
	{
		
		if(time[i]<low)
		{
			low=time[i];
			no_of_person=i;
		}
	}
	
	namecheck=players[no_of_person];
	
	System.out.println("First Rank              : "+low+" Name of The Person  : "+namecheck);	
}

}
/*
 First Rank              : 16.5 Name of The Person  : Sathish
Last Rank               : 30.3  Name Of The Person : Dhanraj
Second Rank             : 19.2 Name Of The Person  : Murali
Second Rank From Last   : 28.4 Name Of The Person  : Benson


*/