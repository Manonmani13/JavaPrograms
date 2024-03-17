package Practice10;

public class Lib {
	public static void main(String args[])
	{
	Lib book=new Lib();
	book.lend();
	book.member();
	book.returnBook();
	}
	void lend()
	{
	System.out.println("lending books");
	}
	void member()
	{
	System.out.println("you are member");
	}
	void returnBook()
	{
	System.out.println("you are returned books");
	}
}
