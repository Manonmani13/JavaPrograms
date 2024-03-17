package String_28_10_21;

public class ToCharArray_2 {
	public char[] toCharArray() {  
	       
	      String value="mano";
		char result[] = new char[value.length()];  
	      System.arraycopy(value,0, result,value.length(), 0);  
	      return result;  
	  }  
	public static void main(String[] args) {
		ToCharArray_2 t=new ToCharArray_2();
		//t.toCharArray();
	}
}
