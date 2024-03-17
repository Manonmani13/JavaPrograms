package Practice12;
class Priya
{
void listen()
{
System.out.println("listen lesson");
}
}
class Susi extends Priya{
void speak()
{
System.out.println("Speak loud");
}
}
interface Cat 
{
void smile();
}
public class  Friends extends Susi implements Cat
{
public void friendship()
{
System.out.println("Friends forever");
}
public void smile()
{
		System.out.println("smile");

}
public static void main(String[] args) {
	Friends d=new Friends();
	d.smile();
	d.friendship();
	d.speak();
	d.listen();
}
}


