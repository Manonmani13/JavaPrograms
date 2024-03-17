package Pro10_11_21;

public class CalassLoad {
public static void main(String[] args) {
	Class c=CalassLoad.class;  
    System.out.println(c.getClassLoader());  
    System.out.println(String.class.getClassLoader());
}
}
/*
jdk.internal.loader.ClassLoaders$AppClassLoader@63961c42
null

*/