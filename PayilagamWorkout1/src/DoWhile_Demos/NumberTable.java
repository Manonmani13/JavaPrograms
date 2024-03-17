package DoWhile_Demos;

public class NumberTable {
int row,col;
void table()
{
	row=1;
	do
	{
	col=1;
		do
		{
			int x=row*col;
			System.out.print(x+"\t");
			col=col+1;
		}while(col<=5);
		System.out.println("\n");
		row=row+1;
		
	}while(row<=5);
}
public static void main(String[] args) {
	NumberTable t=new NumberTable();
	t.table();
}
}
