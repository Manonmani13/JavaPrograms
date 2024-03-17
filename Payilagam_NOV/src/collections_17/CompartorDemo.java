package collections_17;

public class CompartorDemo {
	  String brand;
	  
	  public int compare(Object arg0, Object arg1) {
	    // TODO Auto-generated method stub
	    LaptopBrandOrderNamewise s1=(LaptopBrandOrderNamewise)arg0;
	    LaptopBrandOrderNamewise s2=(LaptopBrandOrderNamewise)arg1;
	    int result=s1.brand.compareTo(s2.brand);
	    if(result>0) { 
	      return 5;
	    }
	    else if(result<0){ 
	      return -5;
	    }
	    else { 
	      return 0;
	    }
	  }
}
