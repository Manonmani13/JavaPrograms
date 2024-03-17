package StringMethos_2;

import java.util.Locale;

public class Tolowercase2 {
    public static void main(String[] args) {  
        String s = "JAVATPOINT HELLO stRIng";    
        String eng = s.toLowerCase(Locale.ITALY);  
        System.out.println(eng);  
        String turkish = s.toLowerCase(Locale.forLanguageTag("tr")); // It shows i without dot  
        System.out.println(turkish);  
    }  
}
/*
javatpoint hello string
javatpoınt hello strıng

*/