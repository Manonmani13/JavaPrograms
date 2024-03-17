package While_Demos;

public class FiveRev {
int no=25;
void rev()
{
	while(no>=5)
	{
		System.out.println(no);
		no=no-5;
	}
}
public static void main(String[] args) {
	FiveRev r=new FiveRev();
	r.rev();
}
}
