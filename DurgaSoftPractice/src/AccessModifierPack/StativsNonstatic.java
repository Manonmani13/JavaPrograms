package AccessModifierPack;

public class StativsNonstatic {
String name;
int rollno,marks;
static String cname;
String getStudentingo(){
	return name+" "+marks;//instane method
}
String getcollege()
{
	return cname;
//staticmethod	
}
int getaverage(int x,int y)
{
return x+y/2;//static methix
/*
 * abstract and static compination is not possible because static we hac=ve mplem
 * 
 */
}
String getcmplete()

{
	return name+ " "+cname+" "+marks;//instance 
}
}
