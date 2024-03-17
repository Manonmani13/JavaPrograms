package Collecction_18;

import java.util.HashMap;

public class HM1 {
public static void main(String[] args) {
	HashMap<String,Integer> hm=new HashMap<String,Integer>();
	hm.put("abcd", 123);
	hm.put("abc", 12);
	System.out.println(hm);
}
}
//{abc=12, abcd=123}