package Date_Time_06_11_21;
import java.util.*;
public class FDOW_Ex3 {

    public static void main(String[] args) {  
      // create a new calendar   
      Calendar mycal = Calendar.getInstance();  
      // print the first day of the week  
      System.out.println("First day is :" + mycal.getFirstDayOfWeek());  
      mycal.setFirstDayOfWeek(7);  
      int firsD = mycal.getFirstDayOfWeek();  
      switch(firsD) {  
         case 1:  
         case 2:  
         case 3:  
            System.out.println(" After changing First Day of Week can be following : Monday , Tuesday , wednasday");  
            break;  
         case 4:  
         case 5:    
         case 6:  
            System.out.println(" After changing First Day of Week can be following : Thirsday , Friday , saturday");  
            break;  
         case 7:  
            System.out.println(" After changing First Day is Sunday");  
            break;  
      }  
   }  
}
/*
First day is :1
 After changing First Day is Sunday

*/