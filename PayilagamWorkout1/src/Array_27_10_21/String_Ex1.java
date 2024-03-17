package Array_27_10_21;

public class String_Ex1 {
public static void main(String[] args) {
	String name="mano";
	System.out.println(name);
	System.out.println(name.hashCode());
	name ="kirthu";
	System.out.println(name.hashCode());
	System.out.println(name);
}
}
/*
 * if you create string variable with two time declaration you think that it will override that.
 * but here it is not happended .it allotate another speace for update that\
 * 
 */
/*
 * ouptut
 * mano
3343957
-1131167443
kirthu

 * */
