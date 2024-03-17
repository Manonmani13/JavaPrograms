package Array_23_10_2021;

public class Auto_unboxing_Example1 {
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
	byte bytevalue=byteobj;  
	short shortvalue=shortobj;  
	int intvalue=intobj;  
	long longvalue=longobj;  
	float floatvalue=floatobj;  
	double doublevalue=doubleobj;  
	char charvalue=charobj;  
	boolean boolvalue=boolobj;  
	System.out.println("---Printing primitive values---");  
	System.out.println("byte value: "+bytevalue);  
	System.out.println("short value: "+shortvalue);  
	System.out.println("int value: "+intvalue);  
	System.out.println("long value: "+longvalue);  
	System.out.println("float value: "+floatvalue);  
	System.out.println("double value: "+doublevalue);  
	System.out.println("char value: "+charvalue);  
	System.out.println("boolean value: "+boolvalue);  

}
}
/*
---Printing primitive values---
byte value: 10
short value: 20
int value: 30
long value: 40
float value: 50.0
double value: 60.0
char value: a
boolean value: true



*/