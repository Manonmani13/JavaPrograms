package String_methods_10_11_21;

import java.util.StringJoiner;

public class StringJoin {
public static void main(String[] args) {
	StringJoiner s=new StringJoiner(" ");
	s.add("hi");
	s.add("mano");
	System.out.println(s.toString());
}
}
//hi mano
