package Map;

import java.util.Arrays;

public class Sort {
public static void main(String[] args) {
	int a[]= {5,10,5,8,13,7};
	String name[]= {"abc","bcd","dd","cfg","hf","fd"};
	for(String na:name)
	{
		System.out.println(na);
	}
	Arrays.sort(name);
	System.out.println();
	for(String n:name)
	{
		System.out.println(n);
	}
}
}
/*
abc
bcd
dd
cfg
hf
fd

abc
bcd
cfg
dd
fd
hf

*/