package Practice5;

public class ChildC  extends SuperC{
	ChildC(int mark)
	{
		super(mark);
	}
	ChildC(int mark,int mark1)
	{
		super(mark,mark1);
	}
public static void main(String[] args) {
	ChildC n=new ChildC(20,30);
	ChildC n1=new ChildC(30);
}
}
