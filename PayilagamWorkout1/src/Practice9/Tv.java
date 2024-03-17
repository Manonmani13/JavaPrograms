package Practice9;

public class Tv  {
	String channelname;
	int price,discount,id;
	public Tv(String channelname,int price)
	{
	this.channelname=channelname;
	this.price=price;
	}
	public Tv(int id,int price,String channelname,int discount)
	{
	if(id==22){
	this.price=price;
	this.channelname=channelname;
	this.discount=discount;
	}
	else
	{
	this.price=price;
	this.channelname=channelname;
	}
	}
	public static void main(String args[])
	{
	Tv channel=new Tv("Sun Tv",30);
	Tv channel1=new Tv(22,55,"Vijay Tv",2);
	    channel1.pack();
		channel.pack();
	}
		void pack()
		{
			System.out.println("Channel name: " +channelname);
			System.out.println("Package Price :" +price);
	        System.out.println("discount price"+discount);
		}
}
