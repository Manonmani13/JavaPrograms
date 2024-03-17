package StringMethos_2;

public class GetChars2 {
	public static void main(String[] args) {  
        String str = new String("Welcome to Javatpoint");  
        char[] ch  = new char[20];  
        try {  
            str.getChars(1, 26, ch, 0);  
            System.out.println(ch);  
        } catch (Exception e) {  
            System.out.println(e);  
        }  
}

}
//java.lang.StringIndexOutOfBoundsException: begin 1, end 26, length 21
