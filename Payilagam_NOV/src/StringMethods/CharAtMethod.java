package StringMethods;

public class CharAtMethod {
	static char value[]= {'m','a','n','o'};
public static void main(String[] args) {
	System.out.println(value);
}

public char charAt(int index) {    
    if ((index < 0) || (index >= value.length)) {    
        throw new StringIndexOutOfBoundsException(index);    
    }    
    return value[index];    
}    
}
