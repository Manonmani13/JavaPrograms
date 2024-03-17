package Six6_10_2021;

public class Compare {
	int x = 20, y = 30, z = 10;
void com() {
	if(x == 20)
	{
	
	 if(y < 50) {
	   System.out.println("ABC");	 
	 }
	 if(z > 30)
	  System.out.println("DEF");
	 else
	   System.out.println("PQR");	 
	}
	else {
	  System.out.println("XYZ");	

}
}
public static void main(String[] args) {
	Compare p=new Compare();
	p.com();
}
}