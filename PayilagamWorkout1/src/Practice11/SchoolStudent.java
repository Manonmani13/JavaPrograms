package Practice11;

public class SchoolStudent {
	int roll,std;
	String name;
	public SchoolStudent(String name,int roll,int std)
	{
	this.name=name;
	this.roll=roll;
	this.std=std;

	}
		public SchoolStudent(String name)
	{
	this.name=name;

	System.out.println("name\t"+name);
	}
	public SchoolStudent(String name,int roll)
	{
	this.name=name;
	this.roll=roll;

	System.out.println("name\t"+name+"\nrollno\t"+roll);
	}
	public static void main(String args[])
		{
			SchoolStudent s3=new SchoolStudent("mano",22,21);
			System.out.println(s3.update());
		SchoolStudent s1=new SchoolStudent("mani",22);
		SchoolStudent s2=new SchoolStudent("maha");
				}
		public SchoolStudent update()
		{
		SchoolStudent s3=new SchoolStudent("mano",22,21);
			
		System.out.println("student1 information\n"+s3.name+" \n"+s3.roll+"\n"+s3.std);
		//System.out.println(return s3);
			return s3;
		}
}
