package Workout7_10_2021;

public class AccountApply {
boolean aadar=true;
boolean pancard=false;
void apply()
{
	if(aadar==true||pancard==true) {
		System.out.println("you can apply");
	}
	else
	{
		System.out.println("you cannot apply");
	}
}
public static void main(String[] args) {
	AccountApply app=new AccountApply();
	app.apply();
}
}
