package Alaphabet;

public class CD {
public static void main(String[] args) {
	for (int row = 1; row <= 9; row++) 
    {
if (row == 1) 
        {
for (int i = 1; i <= 7; i++) 
            {
    System.out.print("* ");
    }
}
        else if (row == 9) 
        {
for (int i = 1; i <= 7; i++)
            {
    System.out.print("* ");
}
}
        else 
        {
System.out.print("*            ");
}
System.out.println();
}
// D
for (int row = 1; row <= 9; row++) 
    {
if (row == 1) 
        {
for (int i = 1; i <= 7; i++) 
            {
    System.out.print("* ");
}
} 
        else if (row == 9) 
        {
for (int i = 1; i <= 7; i++) 
            {
    System.out.print("* ");
}
} 
        else
        {
System.out.print("*            *");
}
System.out.println();
}
}
}
/*
* * * * * * * 
*            
*            
*            
*            
*            
*            
*            
* * * * * * * 
* * * * * * * 
*            *
*            *
*            *
*            *
*            *
*            *
*            *
* * * * * * * 

*/