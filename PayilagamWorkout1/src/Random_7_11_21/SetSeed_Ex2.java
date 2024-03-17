package Random_7_11_21;
import java.util.Random;
public class SetSeed_Ex2 {
	
	
	public static void main(String[] args) {
	      Random random = new Random();
	//return the next pseudorandom integer value
	System.out.println("Random Integer value : " + random.nextInt());
	// setting seed
	long seed = 20;
	//System.out.println(random.setSeed(seed));
	   }
	

}
