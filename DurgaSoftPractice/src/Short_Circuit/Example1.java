package Short_Circuit;

public class Example1 {
public static void main(String[] args) {
	//&& ||->boolean
	//& |->both
	int x=10,y=15;
	if(++x<10&++y>15)
	{
		++x;
	}
	else
	{
		y++;
	}
	System.out.println(x+ " "+y);
	if(++x<10|++y>15)
	{
		++x;
	}
	else
	{
		y++;
	}
	System.out.println(x+ " "+y);

}
}
