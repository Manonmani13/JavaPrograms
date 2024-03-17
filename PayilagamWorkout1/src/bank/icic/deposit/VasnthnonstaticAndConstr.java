package bank.icic.deposit;

public class VasnthnonstaticAndConstr {
	{
		System.out.println("non static block");
	}
	public VasnthnonstaticAndConstr() {
		System.out.println("constructor");
	}
public static void main(String args[]) {
	VasnthnonstaticAndConstr vs=new VasnthnonstaticAndConstr();
	VasnthnonstaticAndConstr vs1=new VasnthnonstaticAndConstr();
	
}
}
