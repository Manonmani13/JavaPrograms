package Practice8_10_2021;

public class ElvenTable {
 int n=1;
 void ele()
 {
	 while(n<=130)
	 {
		 System.out.println(n);
		 n=n*11;
		 
	 }
	 n++;
 }
 public static void main(String[] args) {
	ElvenTable e=new ElvenTable();
	e.ele();
}
}
