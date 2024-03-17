package Variables;

public class Example {
int y=20;
static int x=10;
public static void main(String args[]) {
Example t1=new Example();
t1.x=888;
t1.y=999;
Example t2=new Example();
System.out.println(t2.x+ " "+t2.y);
}
}
