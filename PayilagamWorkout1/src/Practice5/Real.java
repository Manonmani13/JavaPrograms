package Practice5;

class Exam
{
	String name="Muthu";
}
public class Real extends Exam{
String name="latha";
public static void main(String[] args) {
	Real r=new Real();
	r.print();
}
void print()
{
	System.out.println(super.name);
	System.out.println(this.name);
	System.out.println(name);
}
}
