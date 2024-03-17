package Alaphabet;

public class TU {
public static void main(String[] args) {
	for (int row = 1; row <= 7; row++) 
    {
System.out.print("* ");
}
System.out.println();
for (int middle = 1; middle <= 5; middle++) 
    {
for (int space = 1; space <= 3; space++) 
        {
System.out.print("  ");
}
System.out.print("* ");
System.out.println();
}
// U
for (int row = 1; row <= 9; row++) 
    {
 if (row == 9)
         {
for (int i = 1; i <= 7; i++) 
            {
    System.out.print("* ");
}
 } 
         else 
         {
     System.out.print("*           *");
 }
 System.out.println();
}
System.out.println();
}
}
/*
* * * * * * * 
      * 
      * 
      * 
      * 
      * 
*           *
*           *
*           *
*           *
*           *
*           *
*           *
*           *
* * * * * * * 


*/