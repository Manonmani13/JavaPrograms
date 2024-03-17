package Random_7_11_21;
import java.util.Random;
public class SetSeed_Ex1 {	
	public static void main(String[] args) {
	      Random random = new Random();
	//return the next pseudorandom integer value
	System.out.println("Random Integer value : "+random.nextInt());
	// setting seed
	long seed =20;
	random.setSeed(seed);
	//value after setting seed
	System.out.println("Random Integer value : "+random.nextInt());
	   }
	

}
/*
Random Integer value : 1770384625
Random Integer value : -1150867590
*/