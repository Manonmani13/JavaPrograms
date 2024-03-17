package Practice11;

public class School {
	
	String name,department;
	int tamil,english,maths,physics,chemistry,cs,cslab,bio,biolab;


	public School(String department,String name,int tamil,int english,int maths,int physics,int chemistry,int cs,int cslab)

	{

	if(department == "CSE")
	{
	this.department = department;
	this.name
	 = name;
	this.tamil = tamil;
	this.english = english;
	this.maths = maths;
	this.physics = physics;
	this.chemistry = chemistry;
	this.cs = cs;
	this.cslab = cslab;
	System.out.println("csestudent");
		System.out.println(department);
	}
	else if (department == "BIO")
	{
	this.department = department;
	this.name= name;
	this.tamil = tamil;
	this.english = english;
	this.maths = maths;
	this.physics = physics;
	this.chemistry = chemistry;
	this.bio = cs;
	this.biolab = cslab;
	System.out.println("bio student");
	}
	}


	public static  void main(String[] args)

	{
	School csestudent= new School("CSE","Ram",40,50,60,35,55,77,88);
	School biostudent= new School("BIO","Raju",76,84,56,66,76,87,88);

		csestudent.marklist();
		biostudent.marklist();
	}
		void marklist()
		
		{
			if (department == "CSE")
		{
			System.out.println(department);
			System.out.println("Student name "+name);
			System.out.println(tamil);
			System.out.println(english);
			System.out.println(maths);
			System.out.println(physics);
			System.out.println(cs);
			System.out.println(cslab);
		}
			if (department == "BIO")

				{
			System.out.println(department);
			System.out.println("Student name "+name);
			System.out.println(tamil);
			System.out.println(english);
			System.out.println(maths);
			System.out.println(physics);
			System.out.println(bio);
			System.out.println(biolab);
		}
		}
	} 



