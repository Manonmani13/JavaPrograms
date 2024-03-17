package Program_Practie_9_11_21;

public class Bubblesort {
	String []name= {"vijay","surya","arjun","ashwin"};
	int []age= {21,25,19,22};
	

	public static void main(String[] args) {
		Bubblesort bs=new Bubblesort();
		System.out.println("Ascending Order :");
		bs.ascending();
		System.out.println("Discending Order :");
		bs.discending();	
			
			
			
			
	}


	private void discending() {
		for(int i=0;i<name.length;i++)
		{
			int tmp=0;
			String stmp=null;
			for(int j=i+1;j<name.length;j++)
			{
				if(age[i]<age[j])
				{
					tmp=age[i];
					age[i]=age[j];
					age[j]=tmp;
					stmp=name[i];
					name[i]=name[j];
					name[j]=stmp;
				}
			}
		}
		int i=0;
		while(i<name.length)
		{
			System.out.println(name[i]+" : "+age[i]);
			i++;
		}
		
	}


	private void ascending() {
		for(int i=0;i<name.length;i++)
		{
			int tmp=0;
			String stmp=null;
			for(int j=i+1;j<name.length;j++)
			{
				if(age[i]>age[j])
				{
					tmp=age[i];
					age[i]=age[j];
					age[j]=tmp;
					stmp=name[i];
					name[i]=name[j];
					name[j]=stmp;
				}
			}
		}
		int i=0;
		while(i<name.length)
		{
			System.out.println(name[i]+" : "+age[i]);
			i++;
		}
	}
}
/*
Ascending Order :
arjun : 19
vijay : 21
ashwin : 22
surya : 25
Discending Order :
surya : 25
ashwin : 22
vijay : 21
arjun : 19

*/