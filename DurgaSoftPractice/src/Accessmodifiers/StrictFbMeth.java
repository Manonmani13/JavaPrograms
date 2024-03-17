package Accessmodifiers;

public class StrictFbMeth {
strictfp public void m1()
{
	System.out.println(10.0/3);//IEEE 754
	/*all floating point calculation in that method as to follow IEEE 754 statndard so that we wiill 
	 * get platform
	 *abstract is not applicable for implementataion where as strictfp always takes about implementation
	 *abstract strictfb is illegal
	 */
	//independent method
	
}
//abstract strictfp void m2();
}
