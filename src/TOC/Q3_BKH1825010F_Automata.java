
package TOC;

import java.util.Scanner;

/**
 *
 * @author Arafat
 */
public class Q3_BKH1825010F_Automata {

    boolean pdf(String input) {
        int state = 1;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (state == 1 && (ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'Z')) {
                state = 1;
            } else if (state == 1 && (ch == '.')) {
                state = 2;
            } else if (state == 2 && ((ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'O') || (ch >= 'Q' && ch <= 'Z'))) {
                state = 6;
            } else if (state == 2 && ch == 'p') {
                state = 3;
            } else if (state == 3 && ((ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'C') || (ch >= 'E' && ch <= 'Z'))) {
                state = 6;
            } else if (state == 3 && ch == 'd') {
                state = 4;
            } else if (state == 4 && ((ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'E') || (ch >= 'G' && ch <= 'Z'))) {
                state = 6;
            } else if (state == 4 && ch == 'f') {
                state = 5;
            } else if (state == 5 && ((ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'Z'))) {
                state = 6;
            } else if (state == 6 && ((ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'Z'))) {
                state = 6;
            }

        }
        if (state == 5) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Q3_BKH1825010F_Automata obj = new Q3_BKH1825010F_Automata();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("pdf="+obj.pdf(input));
    }
}
