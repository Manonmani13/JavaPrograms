package Practice6;

public class CommonManInChennai implements TrafficRule{
public static void main(String[] args) {
	CommonManInChennai cm=new CommonManInChennai();
	cm.goByBicycle();
	cm.goByDieselVehicle();
	
}
public void goByBicycle()
{
	System.out.println("Go by by bicycle");
}
public void goByDieselVehicle()
{
	System.out.println("go by vehicle");
}
}
