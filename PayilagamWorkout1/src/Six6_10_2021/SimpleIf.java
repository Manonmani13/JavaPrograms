package Six6_10_2021;

public class SimpleIf {

    int i = 20;
void info()
{
	if (i < 15)

        System.out.println("i is smaller than 15");
    else
        System.out.println("i is greater than 15");

    System.out.println("Outside if-else block");

}
public static void main(String[] args) {
	SimpleIf d=new SimpleIf();
	d.info();
}
}