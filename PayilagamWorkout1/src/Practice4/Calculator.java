package Practice4;

public class Calculator {
public void add(int i,int j) {
	System.out.println(i+j);
}
public void mult(int i,int j)
{
	System.out.println(i*j);
}
public static void main(String[] args) {
	Calculator n=new Calculator();
	n.add(23,44);
	n.mult(2, 3);
}
}
