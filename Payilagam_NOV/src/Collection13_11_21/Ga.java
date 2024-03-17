package Collection13_11_21;

public class Ga {
	public static void main(String[] args) {
	Ga g1 = new Ga(); 
	  Ga g2 = new Ga(); 
	  System.out.println(g1.hashCode());
	  System.out.println(g2.hashCode());
	  System.out.println(g1.equals(g2));
	  }
	  public boolean equals(Object o1)
	  {
	    int hc1 = this.hashCode();
	    Ga g2 = (Ga) o1; //Type Casting- Up Down Casting
	    int hc2 = g2.hashCode();
	    if(hc1==hc2)
	      return true;
	    else
	      return false;  
	  }
	/*  public int hashCode()
	  {
	    return 1;
	  }*/
}
/*
Game g1 = new Game(); 
  Game g2 = new Game(); 
  System.out.println(g1.hashCode());
  System.out.println(g2.hashCode());
  System.out.println(g1.equals(g2));
  }
  public boolean equals(Object o1)
  {
    int hc1 = this.hashCode();
    Game g2 = (Game) o1; //Type Casting- Up Down Casting
    int hc2 = g2.hashCode();
    if(hc1==hc2)
      return true;
    else
      return false;  
  }
  public int hashCode()
  {
    return 1;
  }
*/