package Programs_8_11_21;

public class StackTRace_Ex1 {
	public static void main(String args[])   
	{  
	demo();  
	}  
	static void demo()   
	{  
	demo1();  
	}  
	static void demo1()   
	{  
	demo2();  
	}  
	static void demo2()   
	{  
	demo3();  
	}  
	static void demo3()   
	{  
	Thread.dumpStack();  
	}  
}
/*
java.lang.Exception: Stack trace
	at java.base/java.lang.Thread.dumpStack(Thread.java:1383)
	at Programs_8_11_21.StackTRace_Ex1.demo3(StackTRace_Ex1.java:22)
	at Programs_8_11_21.StackTRace_Ex1.demo2(StackTRace_Ex1.java:18)
	at Programs_8_11_21.StackTRace_Ex1.demo1(StackTRace_Ex1.java:14)
	at Programs_8_11_21.StackTRace_Ex1.demo(StackTRace_Ex1.java:10)
	at Programs_8_11_21.StackTRace_Ex1.main(StackTRace_Ex1.java:6)

*/