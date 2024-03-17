package BasicPrograms_10_11_21;

public class Password extends Exception {
public static void main(String[] args) {
	Password p=new Password();
	try {
		p.checkpasssword("abcd");
	} catch (Password e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public void checkpasssword(String pwd) throws Password
{
	if(pwd.length()<8)
	{
		Password p=new Password();
		throw p;
	}
}
}
/*
BasicPrograms_10_11_21.Password
	at BasicPrograms_10_11_21.Password.checkpasssword(Password.java:18)
	at BasicPrograms_10_11_21.Password.main(Password.java:7)
*/