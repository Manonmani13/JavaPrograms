package Array_23_10_2021;

public class AutoBoxing_Example1 {
public static void main(String[] args) {
	byte b=10;  
	short s=20;  
	int i=30;  
	long l=40;  
	float f=50.0F;  
	double d=60.0D;  
	char c='a';  
	boolean b2=true;
	Byte byteobj=b;  
	Short shortobj=s;  
	Integer intobj=i;  
	Long longobj=l;  
	Float floatobj=f;  
	Double doubleobj=d;  
	Character charobj=c;  
	Boolean boolobj=b2;  
	System.out.println("---Printing object values---");  
	System.out.println("Byte object: "+byteobj);  
	System.out.println("Short object: "+shortobj);  
	System.out.println("Integer object: "+intobj);  
	System.out.println("Long object: "+longobj);  
	System.out.println("Float object: "+floatobj);  
	System.out.println("Double object: "+doubleobj);  
	System.out.println("Character object: "+charobj);  
	System.out.println("Boolean object: "+boolobj); 
}
}
/*
---Printing object values---
Byte object: 10
Short object: 20
Integer object: 30
Long object: 40
Float object: 50.0
Double object: 60.0
Character object: a
Boolean object: true


*/