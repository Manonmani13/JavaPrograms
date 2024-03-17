package Game_5_11_21;

import java.util.*;

public class Random_Ex3 {
	public static void main(String args[]) {
        final String target = getNum();
        System.out.println("COWS AND BULLS:");
        Scanner in = new Scanner(System.in);
        for (int i = 1; i <= 7; i++) {
            System.out.print(i+". ");
            String guess = in.next();
            int feedback = feedback(target, guess);
            System.out.println(guess+" - "+(feedback/10)+" bulls, "+(feedback%10)+" cows");
            if (feedback == 40) {System.out.println("CONGRATULATIONS! YOU WIN!"); return;}
        }
        System.out.println("You have run out of moves. The number was - "+target);
    }

    static String getNum() {
        ArrayList<String> possib = new ArrayList<String>();
        for (int a = 1; a <= 9; a++) { 
            for (int b = 1; b <= 9; b++) {
                if (b == a) continue;
                for (int c = 1; c <= 9; c++) {
                    if (c == b || c == a) continue;
                    for (int d = 1; d <= 9; d++) {
                        if (d == a || d == b || d == c) continue;
                        String cnt = ""+a+b+c+d;
                        possib.add(cnt);
                    }
                }
            }
        }
        String guess = possib.get((int)(Math.random() * possib.size()));
        return guess;
    }

    static int feedback(String ans,String guess) {
        int bulls = 0, cows = 0;
        for (int i = 0; i < guess.length(); i++) {
            int ind = ans.indexOf(guess.charAt(i));
            if (ind == i) bulls++;
            else if (ind >= 0) cows++;
        }
        return bulls * 10 + cows;
    }
}

class Main {
    static ArrayList<String> possib = new ArrayList<String>();
    public static void main(String args[]) {
        System.out.println("COWS AND BULLS SOLVER:");
        init();
        Scanner in = new Scanner(System.in);
        while (possib.size() > 1) {
            String guess = possib.get((int)(Math.random() * possib.size()));
            System.out.print(guess+" ");
            int bulls = in.nextInt();
            int cows = in.nextInt();
            for (int j = 0; j < possib.size(); j++)
                if (!check(possib.get(j),guess,cows,bulls)) {
                    possib.remove(j);
                    j--;
                }
        }
        for (int j = 0; j < possib.size(); j++)
            System.out.println(possib.get(j));
    }
    
    static void init() {
        for (int a = 1; a <= 9; a++) { 
            for (int b = 1; b <= 9; b++) {
                if (b == a) continue;
                for (int c = 1; c <= 9; c++) {
                    if (c == b || c == a) continue;
                    for (int d = 1; d <= 9; d++) {
                        if (d == a || d == b || d == c) continue;
                        String cnt = ""+a+b+c+d;
                        possib.add(cnt);
                    }
                }
            }
        }
    }
    
    static boolean check(String ans,String guess,int cows,int bulls) {
        for (int i = 0; i < guess.length(); i++) {
            int ind = ans.indexOf(guess.charAt(i));
            if (ind == i) bulls--;
            else if (ind >= 0) cows--;
        }
        return (cows == 0) && (bulls == 0);
    }
}
/*
COWS AND BULLS:
1. 4
4 - 0 bulls, 1 cows
2. 5
5 - 0 bulls, 1 cows
3. 2
2 - 0 bulls, 0 cows
4. 6
6 - 0 bulls, 0 cows
5. 1
1 - 0 bulls, 0 cows
6. 6
6 - 0 bulls, 0 cows
7. 1
1 - 0 bulls, 0 cows
You have run out of moves. The number was - 9345
*/