package Six6_10_2021;

public class PosstiveAndNegative {
int number=-13;
void numberfinding()
{
	if(number>0)
	{
		System.out.println("Postive Number");
	}
	else if(number<0){
		System.out.println("Negative Number");
	}
	else
	{
		System.out.println("Zero");
	}
}
public static void main(String[] args) {
	PosstiveAndNegative pn=new PosstiveAndNegative();
	pn.numberfinding();
}
}
