package AssignmentOperators;

public class Example3 {
public static void main(String[] args) {
int f=10;
f=f+1;
System.out.println(f);
int a,b,c,d;
a=b=c=d=20;
a+=b-=c*=d/=2;
System.out.println(a+" "+b+" "+c+" "+d);
}
}
