package Workout10_19_2021;

public class Static_method_Example extends Static_method {
	/*
	 * we can give static for same method same in different class we actually access static method through 
	 * class name so the corresponding method wont come
	 * if you access the static method through object it gives that class method statments \
	 *we can give private
	 * we can give public protected and default 
	 */
	static void add()
	{
		System.out.println("add the numbers");
	}
public static void main(String[] args) {
	Static_method_Example d=new Static_method_Example();
	d.add();
add();	
Static_method.add();
}

}

class Static_method extends Static_met
{
	static void add()
	{
		System.out.println("add ");
	}
}
class Static_met 
{
	static void add()
	{
		System.out.println("add  from static met");
	}
}