package Practice2;

public class Bo extends Ho {
int price,discount;
int offer=1000;
public Bo(int price,int discount) {
	super(price,discount);
	this.price=price;
	this.discount=discount;
	System.out.println("from BO "+price+"\n"+discount);

}
public static void main(String[] args) {
	Bo tv=new Bo(10000,500);
	Bo f=new Bo(2000,3000);
	f.purchase();
	tv.purchase();
	f.print();
}
 void purchase() {
	System.out.println("purchase");
	System.out.println(offer);
	System.out.println(super.offer);
	System.out.println(this.offer);
	
}
}

