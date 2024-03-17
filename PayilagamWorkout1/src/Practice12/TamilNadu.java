package Practice12;

public class TamilNadu extends SouthIndia {
	static String capital = "Chennai";
	public TamilNadu(String primeMinister) {
			super(primeMinister);
			// TODO Auto-generated constructor stub
		}

	public static void main(String args[])
	{
	System.out.println(India.capital);
	System.out.println(TamilNadu.capital);
	SouthIndia si = new TamilNadu("Modi");
	si.cultivate();
	si.livingStyle();

	}
	public void cultivate()
	{
	System.out.println("Rice and Sugar cane cultivation");
	}
	public void livingStyle()
	{
	System.out.println("Above Average development");
	}
	public void speakLanguage()
	{
	System.out.println("you can speack english soon");
	}
	 void eat(){
	 System.out.println("eat healthy foods");
	 }
	 void dress()
	 {
	 System.out.println("wear treaditional dress");
	 }
}
