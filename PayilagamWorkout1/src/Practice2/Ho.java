package Practice2;

public class Ho {

	 int price;
	 int discount;
	public int offer=2000;

	public Ho(int price, int discount) {
		this.price=price;
		this.discount=discount;
		System.out.println(price+"\n"+discount);
	}
	void print()
	{
		System.out.println("offer"+offer);
	}

}
