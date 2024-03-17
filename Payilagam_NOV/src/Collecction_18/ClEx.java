package Collecction_18;

public class ClEx<T> {
	 T ob;
	  
	  public ClEx(T ob)
	  {
	    this.ob = ob; 
	  }
	
	public void display()
	  {
	    System.out.println(ob + " --> "+ob.getClass().getName());
	  }

}
