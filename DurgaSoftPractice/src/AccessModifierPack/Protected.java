package AccessModifierPack;

public class Protected {
/*
 * private->default->protected->public
 *  inside all the classes outside the package only in the child classes
 *  protected=default+kids
 */
	protected void eat()
	{
		System.out.println("ice cream");
	}
}
