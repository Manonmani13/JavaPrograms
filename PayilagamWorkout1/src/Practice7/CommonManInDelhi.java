package Practice7;
import Practice6.TrafficRule1;
public class CommonManInDelhi implements TrafficRule1,TrafficRule {
	public static void main(String[] args) {
		CommonManInDelhi c=new CommonManInDelhi();
		c.goByBicycle();
		c.goByDieselVehicle();
		
	}
	public void goByBicycle()
	{
		System.out.println("Go by by bicycle from delhi");
	}
	public void goByDieselVehicle()
	{
		System.out.println("go by vehicle delhi");
	}
}
