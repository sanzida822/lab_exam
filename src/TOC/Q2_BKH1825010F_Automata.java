/**
 * **
 * Name : <Sanzida Sultana>
 * Roll No: <BKH1825010F>
 * Email : <sanzida2514@student.nstu.edu.bd>
 * Date : <19.09.2021 >
 ***
 */
package TOC;

import java.util.Scanner;

/**
 *
 * @author Arafat
 */
public class Q2_BKH1825010F_Automata {

    public boolean oddBinary(String s) {
        char state = '1';
        boolean accepted = false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (state == '1' && ch == '0') {
                state = '1';
            } else if (state == '1' && ch == '1') {
                state = '2';
            } else if (state == '1' && ((ch > '1' && ch <= '9') || (ch >= 'A' && ch <= 'Z'))) {
                state = '3';

            } else if (state == '2' && (ch == '0')) {
                state = '1';
            } else if (state == '2' && (ch == '1')) {
                state = '2';
            } else if (state == '2' && ((ch > '1' && ch <= '9') || (ch >= 'A' && ch <= 'Z'))) {
                state = '3';

            } else if (state == '3' && ((ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'Z'))) {
                state = '3';
            }
        }
        if (state == '2') {
            accepted = true;
        } else {
            accepted = false;
        }
        return accepted;
    }

    public boolean isNumber(String s) {
        char state = '1';
        boolean accepted = false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (state == '1' && (ch >= '0' && ch <= '9')) {
                state = '2';
            } else if (state == '1' && (ch >= 'A' && ch <= 'Z')) {
                state = '3';
            } else if (state == '2' && (ch >= '0' && ch <= '9')) {
                state = '2';
            } else if (state == '2' && (ch >= 'A' && ch <= 'Z')) {
                state = '3';
            } else if (state == '3' && (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')) {
                state = '3';
            }
        }
        if (state == '2') {
            accepted = true;
        } else {
            accepted = false;
        }
        return accepted;
    }

    public static void main(String[] args) {
        Q2_BKH1825010F_Automata ob = new Q2_BKH1825010F_Automata();
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println("isNumber="+ob.isNumber(input));
        System.out.println("oddnumber="+ob.oddBinary(input));
    }
}
/**
 * **
 *
 * q<1>@<sanzida2514@student.nstu.edu.bd>#2021
 *
 ***
 */
