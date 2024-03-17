package Random_7_11_21;


	import java.util.Scanner;

	public class Demo {
		static int count=0;
		static int position[] =new int[count];
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int uc;
			int gc;

			System.out.println("Enter the number");
			uc=sc.nextInt();
			System.out.println("Enter the number2");
			
			gc=sc.nextInt();
			
			int a[]=new int[uc];
			int b[]=new int[gc];
			char ch[]=new char[gc];
			int indexi[]=new int[3];
			int indexj[]=new int[3];
			
		
			for(int num=0; num<a.length;num++) a[num]=sc.nextInt();
			for(int num1=0; num1<b.length;num1++) b[num1]=sc.nextInt();
			
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<b.length;j++) {
					if(a[i]==b[j] && i==j)
					{
						ch[j]= 'C';
					}else if(a[i]==b[j] && i!=j &&ch[j]!='C')
					{
						ch[j]='P';
						indexi[i]=i;
						indexj[j]=j;
						//int temp=b[i];
						//int vv=b[i]=a[i];
						//int vvv=b[j]=temp;
						//System.out.println(vv+"dd"+"ddd"+vvv);
					}
					else {
						if(a[i]!=b[j]&&ch[j]!='C')
						ch[j]='X';
					}
					
				}
			}
			
			for(int ss=0;ss<indexi.length;ss++)
			{
				for(int sss=0;sss<indexj.length;sss++)
				if(indexi[ss]!=0 &&indexj[sss]!=0) {
					int temp=b[ss];
					b[ss]=b[sss];
					b[sss]=temp;
				}
					
			}
			
			for(int ii=0;ii<a.length;ii++) {
				if(a[ii]!=b[ii]) {
					count++;
				}
			}
			for (int jj=0;jj<position.length;jj++)
				if(a[jj]!=b[jj]) position[jj]=jj;
				
			for(int aa: position)System.out.println("posiii"+aa);
			System.out.println("count"+count+"positio"+position);
			for(char c: ch)System.out.println(c);
			for(int v: b)System.out.print("barry"+v);
			for(int vv:indexi)System.out.println("indexi"+vv);
			for(int vvv:indexj)System.out.println("indexj"+vvv);
		}

	}

