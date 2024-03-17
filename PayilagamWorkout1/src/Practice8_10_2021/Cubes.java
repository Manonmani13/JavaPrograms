package Practice8_10_2021;

public class Cubes {
int i=1,l;
void cube() {
do
{
	l=i*i*i;
	System.out.println(l);
	
	
	i++;
}while(i<=6);

}
public static void main(String[] args) {
	Cubes d=new Cubes();
	d.cube();
}
}
