package Workout10_19_2021;

public class Final_method_Exam extends Final_method {
/*static  void food()
{
//we cannot overrid final method	
}*/
	public static void main(String[] args) {
		food();
	}
}
class Final_method
{
	//we can public private default protected and static  for final method
	 static final void food()
	{
		System.out.println("pongal");
	}
}