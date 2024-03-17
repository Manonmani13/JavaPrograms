package LogicalPrograms_25_10_2021;

public class Static_variable extends Static{
public static void main(String[] args) {
	Static s=new Static();
	System.out.println(Static_variable.c);
	System.out.println(Static.c);
}
}
class Static
{
	static int c=10;
}
/*
10
10
*/