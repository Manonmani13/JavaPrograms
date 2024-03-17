package Oct_14_2021;

public class ReverseNo2 {
public static void main(String[] args) {
	int number=7655443,reverse=0;
	for(;number != 0;)   
	{  
	int remainder = number % 10;  
	reverse = reverse * 10 + remainder;  
	number=number/10;  
	}  
	System.out.println(reverse);
}
}
