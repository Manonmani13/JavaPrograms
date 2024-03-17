package Practice9;

public class Student {
	int mark1,mark2,mark3,mark4,mark5,mark6;
	int lab1,lab2,lab3,deptID;
	Student(int deptID,int mark1,int mark2,int mark3,int lab1,int lab2,int lab3)
	{
	if(deptID==222)
	{
	this.mark1=mark1;
	this.mark2=mark2;
	this.mark3=mark3;
	this.lab1=lab1;
	this.lab2=lab2;
	this.lab3=lab3;

	  }
	  else if(deptID==333)
	  {
	  this.mark1=mark1;
	this.mark2=mark2;
	this.mark3=mark3;
	this.mark4=lab1;
	this.mark5=lab2;
	this.mark6=lab3;
		
	  
	  }
		else if(deptID==111)
		{
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
		this.mark4=lab1;
		this.lab2=lab2;
		this.lab3=lab3;
			
		}

		else
		{
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
		this.mark4=lab1;
		this.mark5=lab2;
		this.lab3=lab3;
			
	}
	}
	public static void main(String args[])
	{

	Student bioStudent=new Student(222,60,50,70,80,90,70);
	Student hisStudent=new Student(333,80,90,78,67,88,56);
	Student accStudent=new Student(111,80,90,78,67,88,56);
	Student cseStudent=new Student(444,80,90,78,67,88,56);
	bioStudent.lead();
	hisStudent.write();
	cseStudent.print();
	accStudent.mar();
	}
	 
	  void lead()
	  {
		    System.out.println("biostudent");
	    System.out.println("Subject1 : "+mark1+"\nSubject2 :  "+mark2+"\nSubject3 : "+mark3+"\nLab1 : "+lab1+"\nLab2:  "+lab2+"\nLab3 : "+lab3);
	  }

	 void write()
	  { 
		   System.out.println("Histroy");
	    System.out.println("Sub1 : "+mark1+"\nsub2 : "+mark2+"\nsub3 : "+mark3+"\nsub4 : "+mark4+"\nsub5 : "+mark5);  
	  }

		void print()
		{
			  System.out.println("CSE");
			System.out.println("Sub1 : "+mark1+"\nsub2 : "+mark2+"\nsub3 : "+mark3+"\nsub4 : "+mark4+"\nlab1 : "+lab2+"\nlab2 : "+lab3);
		}
		void mar()
		{
			System.out.println("Accounts");
			System.out.println("Sub1 : "+mark1+"\n Sub2 :"+mark2+"\n Sub3 :"+mark3+"\n Sub4: "+mark4+"\n Sub5 :"+mark5+"\n Lab1 :"+lab3);	
		}
}
