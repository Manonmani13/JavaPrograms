package Map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Proper {
public static void main(String[] args) throws IOException {
	Properties p = new Properties();
	FileInputStream fis = new 
	FileInputStream("/home/manon/eclipse-workspace/Payilagam_NOV/src/Map/application.properties");

		p.load(fis);
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("password"));
		p.setProperty("db", "mysql");
		p.setProperty("password","mano" );		FileOutputStream fos = new 
	FileOutputStream("/home/manon/eclipse-workspace/Payilagam_NOV/src/Map/application.properties");
		///home/muthu/eclipse-workspace/Selenium Project/src/selenium/learnings/application.properties
	p.store
	(fos, "Added few things"); 
}
}
