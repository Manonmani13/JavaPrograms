package Accessmodifiers;

public class Defaultmethod {
/*
 * if a member declare as default we cannot access it outside of the package even if the class is public
 */
	void sleep()
	{
		System.out.println("sleep");
	}
}
