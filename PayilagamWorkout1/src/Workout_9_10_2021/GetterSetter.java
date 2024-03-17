package Workout_9_10_2021;

public class GetterSetter {
private String name;
public void setName(String name)
{
	this.name=name;
}
public String getName()
{
	return name;
}
private boolean empty;
public boolean getEmpty()
{
	return empty;
}
public boolean isEmpty()
{
	return empty;
}
public static void main(String[] args) {
	GetterSetter g=new GetterSetter();
	g.setName("mano");
	g.getName();
	g.getEmpty();
	g.isEmpty();
}
}
