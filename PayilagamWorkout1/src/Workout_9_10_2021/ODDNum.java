package Workout_9_10_2021;

public class ODDNum {
	
		int n=1,n1=2;
		void odd()
		{
			do
			{
				System.out.println(n);
				n=n+n1;
			}while(n<=27);
		}
		public static void main(String[] args) {
			ODDNum N=new ODDNum();
			N.odd();
		}
}
