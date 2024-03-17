package Date_Time_6_11_21;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTime_Ex1 {
public static void main(String[] args) {
	DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	LocalDateTime n=LocalDateTime.now();
	System.out.println(dtf.format(n));
}
}
//2021/11/06 15:10:45