package Map;
import java.util.*;
public class Task {
	public static void main(String[] args) {
	    // TODO Auto-generated method stub
	    HashMap hm=new HashMap();
	    /*
	     * String m=""; m=m+"santhiya "; m=m+"ram "; System.out.println(m);
	     */
	    
	    
	    hm.put("Tamil I","9am");
	    hm.put("Tamil II","10am");
	    hm.put("English I","2pm");
	    hm.put("English II","2pm");
	    hm.put("Maths","9am");
	    hm.put("Science", "10am");
	    hm.put("SocialScience","10am");
	    //System.out.println(hm);
	    Set s=hm.entrySet();
	    //System.out.println(s);
	    //System.out.println(s);
	    Collection c=hm.values();
	    //System.out.println(c);
	    //System.out.println(hm);
	    Iterator i=s.iterator();
	    String start_S_letter_paper_name="";
	    String ends_s_letter_paper_name="";
	    String time_I_paper="";
	    String time_II_paper="";
	    boolean b=i.hasNext();
	    while(b==true) { 
	      Object o=i.next();//k:6  ( k,v)    tam:9
	      Map.Entry entry=(Map.Entry)o;   
	      //System.out.println(entry);
	      String v1=(String)entry.getKey();   //e.tamil I
	      //System.out.println(v1);
	      int str_len=v1.length();
	      if(v1.charAt(0)=='S') { //maths,,Sci S==S
	        //System.out.println(v1);
	        start_S_letter_paper_name=start_S_letter_paper_name+v1+", ";
	      }
	      else if(v1.charAt(str_len-1)=='s') { //maths=5,0     Tamil I,eng I  ,Ta   II
	        //System.out.println(v1);
	        ends_s_letter_paper_name=ends_s_letter_paper_name+v1+", ";
	      }
	      else if(v1.charAt(str_len-1)=='I'&&v1.charAt(str_len-2)!='I') { 
	        //System.out.println(v1);
	        //System.out.println(entry.getValue());
	         Object o1=entry.getValue(); ///9
	         String timeI=o1.toString();
	        // System.out.println(time1);
	         time_I_paper=time_I_paper+timeI+", ";
	      }
	      else if(v1.charAt(str_len-1)=='I' && v1.charAt(str_len-2)=='I') { //tami   II
	      //  System.out.println(v1);
	        //System.out.println(entry.getValue());
	         Object o1=entry.getValue();
	         String timeII=o1.toString();
	        // System.out.println(timeII);
	         time_II_paper=time_II_paper+timeII+", ";
	      }
	       b=i.hasNext();
	    }
	    
	      System.out.println("start S charcter Exam names are "
	      +start_S_letter_paper_name);
	      System.out.println("start s charcter Exam names are "
	      +ends_s_letter_paper_name);
	      System.out.println("I paper times are "+time_I_paper);
	      System.out.println("II paper times are "+time_II_paper);
	    
	    
	  }
}
/*
start S charcter Exam names are Science, SocialScience, 
start s charcter Exam names are Maths, 
I paper times are 2pm, 9am, 
II paper times are 10am, 2pm, 

*/