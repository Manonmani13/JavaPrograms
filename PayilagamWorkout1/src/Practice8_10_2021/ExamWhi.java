package Practice8_10_2021;

public class ExamWhi {
int n=2,n1=4;
int c=0;
void pro()
{
	
	while(c<5)

	{
		
		n1=n1+2;
		n=n+n1;
		System.out.println(n);
		c++;
	}
}
public static void main(String[] args) {
	ExamWhi h=new ExamWhi();
	h.pro();
}
}
