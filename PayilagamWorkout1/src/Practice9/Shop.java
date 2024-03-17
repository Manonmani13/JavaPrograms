package Practice9;

public class Shop {
	static String owner="mano";
	String brand;
	int price;
	int discount;
	public Shop(String product,int price)
	{
	this.brand= product;
	this.price=price;
	}
	public Shop()
	{
	System.out.println("Zero arguments constructor");
	}
	public Shop(String product,int price,int discount)
	{
	this.brand=product;
	this.price=price;
	this.discount=discount;
	}
	public static void main(String args[])
	{
	Shop prod1=new Shop("ABC",10);
	Shop prod2=new Shop("PQR",20);
	Shop prod3=new Shop("XYZ",30,4);
	Shop printer=new Shop();
	}
}
