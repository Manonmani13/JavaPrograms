package Collection_12_11_21;

public class Patter_49 {
public static void main(String[] args) {
	int x=1,y=5,t1,t2,r1,r2;
	for(int i=5;i>=1;i--)//5>1 4>1 3>1 2>1
	{
		t1=x;//1 6 10 13
		t2=y;//5 9 12 14
		r1=i;//5 4 3 2
		r2=i+1;//6 5 4 3
		for(int j=5;j>=i;j--)//5>5 
		{
			if((i+j)%2==0)//10/2
			System.out.print(t1+" ");//1 10
			else
				System.out.print(t2+" ");//9 14
			t1=t1-r1++;//5 3 8 12
			t2=t2-r2++;//2 5 9 
			
		}
		y=y+i-1;//9 12 14
		x=x+i;//6 10 13
		System.out.println();
	}
}
}
/*
1 
9 2 
10 8 3 
14 11 7 4 
15 13 12 6 5 

*/