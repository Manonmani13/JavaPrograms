package collections_17;

import java.util.ArrayList;
import java.util.Collections;

public class LaptopBrandOrderNamewise {
	String brand;
	  int price;
	  int ram;
	  
	  public LaptopBrandOrderNamewise() {
	    // TODO Auto-generated constructor stub
	    
	  }
	  public LaptopBrandOrderNamewise(String string, int i, int j) {
	    // TODO Auto-generated constructor stub
	    this.brand=string;
	    this.ram=i;
	    this.price=j;
	  }

	  public static void main(String[] args) {
	    // TODO Auto-generated method stub
	      LaptopBrandOrderNamewise l1=new LaptopBrandOrderNamewise("Dell",4,40000);
	      LaptopBrandOrderNamewise l2=new LaptopBrandOrderNamewise("Hp",4,45000);
	      LaptopBrandOrderNamewise l3=new LaptopBrandOrderNamewise("Lenovo",4,50000);
	      LaptopBrandOrderNamewise l4=new LaptopBrandOrderNamewise("Acer",4,30000);
	      LaptopBrandOrderNamewise l5=new LaptopBrandOrderNamewise("Sony",4,10000);
	      
	      LaptopBrandOrderNamewise l7=new LaptopBrandOrderNamewise("Lenovo",4,25000);
	      CompartorDemo cd=new CompartorDemo();
	      ArrayList al=new ArrayList();
	      al.add(l1);
	      al.add(l2);
	      al.add(l3);
	      al.add(l4);
	      al.add(l5);
	      
	      al.add(l7);
	      System.out.println(al);
	     // Collections.sort(al,cd);
	      System.out.println(al);
	  }
	  

	  @Override
	  public String toString() {
	    return  ""+this.brand+" "+this.ram+" "+this.price;  }
	  

	}

