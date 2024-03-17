package Pattern_Pro;

public class Patt14 {
public static void main(String[] args) {
	for (int j = 10; j >= 5; j--) {
        for (int i = j; i >= 5; i--) {
            if (i % 2 == 0) {
                System.out.print("0" + " ");
            } else
                System.out.print("1" + " ");
        }
        for (int i = 10; i >= j; i--) {
 
            if (i % 2 == 0) {
                System.out.print("0" + " ");
            } else
                System.out.print("1" + " ");
        }
        System.out.println();
    }
}
}
/*
0 1 0 1 0 1 0 
1 0 1 0 1 0 1 
0 1 0 1 0 1 0 
1 0 1 0 1 0 1 
0 1 0 1 0 1 0 
1 0 1 0 1 0 1 

*/