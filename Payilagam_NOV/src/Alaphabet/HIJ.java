package Alaphabet;

public class HIJ {
public static void main(String[] args) {
	for (int row = 1; row <= 9; row++)
    {
if (row == 5) 
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
// I
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
for (int last = 1; last <= 7; last++)
    {
System.out.print("* ");
}
System.out.println();
// J
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
for (int last = 1; last <= 4; last++) 
    {
System.out.print("* ");
}
}
}
/*
*           *
*           *
*           *
*           *
* * * * * * * 
*           *
*           *
*           *
*           *

* * * * * * * 
      * 
      * 
      * 
      * 
      * 
* * * * * * * 
* * * * * * * 
      * 
      * 
      * 
      * 
      * 
* * * * 
*/