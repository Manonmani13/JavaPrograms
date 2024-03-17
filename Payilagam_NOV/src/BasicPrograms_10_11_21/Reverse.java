package BasicPrograms_10_11_21;

public class Reverse {
	public static void main(String[] args) {
		 String s="pandukumar manonmani ";
		 System.out.println("Input string is: "+s);
		  

		 String s1="";
		 for(int i=s.length()-1;i>=0;i--) { 
		   s1=s1+s.charAt(i);
		 }
		 //System.out.println(s1);
		 char ch[]=s1.toCharArray();

		 int space=0;
		 int count=0;
		 for(int i=0;i<ch.length;i++) { 
		   if(ch[i]==' ') { 
		     count++;
		     char[] fin=reverse(s1,space,i-1)  ;
		     //System.out.println(i);
		     s1=new String(fin);
		     space=i;
		     }
		   
		 }
		 ch=reverse(s1,space,s.length()-1);
		 s1=new String(ch);
		 System.out.println("Output string is: "+s1);
		 //System.out.println(count);



		   }

		   public static char[] reverse(String s,int start, int end) {
		     // TODO Auto-generated method stubc
		     String s1=s;
		     char ch[]=s1.toCharArray();
		    
		     int i=start;
		     int j=end;
		     char temp;
		     //System.out.println(i);
		     //System.out.println(j);
		     
		       while(i<j) {       //aras
		         temp=ch[i];//a
		         ch[i]=ch[j];//ch[0]=ch[3]===s
		         ch[j]=temp;//ch[]
		         i++;
		         j--;
		       }
		      
		     for(int k=0;k<ch.length;k++) { 
		       //System.out.print(ch[k]+" ");
		     }
		     
		     return ch;
		   }

}
