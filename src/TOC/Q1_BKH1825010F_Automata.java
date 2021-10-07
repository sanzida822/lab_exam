package TOC;

/**
 * **
 * Name : <Sanzida Sultana>
 * Roll No: <BKH1825010F>
 * Email : <sanzida2514@student.nstu.edu.bd>
 * Date : <19.09.2021 >
 ***
 */
import java.util.Scanner;

public class Q1_BKH1825010F_Automata {

    public boolean binary_number(String s) {
        char state = '1';
        boolean accepted = false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (state == '1' && (ch == '0' | ch == '1')) {
                state = '2';

            } else if (state == '1' && ((ch > '1' && ch <= '9') || (ch >= 'A' && ch <= 'Z'))) {
                state = '3';
            } else if (state == '2' && (ch == '0' || ch == '1')) {
                state = '2';
            } else if (state == '2' && ((ch > '1' && ch <= '9') || (ch >= 'A' && ch <= 'Z'))) {
                state = '3';
            } else if (state == '3' && ((ch > '0' && ch <= '9') || (ch >= 'A' && ch <= 'Z'))) {
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

    public boolean decimal(String s) {
        char state = '1';
        boolean accepted = false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (state == '1' && (ch >= '0') && ch <= '9') {
                state = '2';
            } else if (state == '1' && (ch >= 'A' && ch <= 'Z')) {
                state = '3';
            } else if (state == '2' && (ch >= '0' && ch <= '9')) {
                state = '2';
            } else if (state == '2' && (ch >= 'A' && ch <= 'Z')) {
                state = '3';
            } else if (state == '3' && ((ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9'))) {
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

    public boolean hexaDecimal(String s) {
        char state = '1';
        boolean accepted = false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(state=='1' &&((ch>='0' && ch<='9') ||( ch>='A' && ch<='F'))){
                state='2';               
            }
            else if(state=='1' &&(ch>='G' && ch<='Z')){
            state='3';
            }
            
            else if(state=='2' &&((ch>='0' && ch<='9') ||( ch>='A' && ch<='F'))){
                state='2';               
            }  
             else if(state=='2' &&(ch>='G' && ch<='Z')){
            state='3';
            }
             else if(state=='3' &&((ch>='0' && ch<='9') ||( ch>='A' && ch<='Z'))){
                state='3';               
            } 
            
        
        }
          
        if(state=='2'){
        accepted=true;
        }   else{
        accepted=false;
        } 
            
            
            return accepted;
        }
public boolean octal(String s){
 char state = '1';
        boolean accepted = false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(state=='1' &&( ch>='0' && ch<='7')){
                state='2';
            }
            else if(state=='1' && ((ch>='A' && ch<='Z')||(ch>='8' && ch<='9'))){
            state='3';
            }
            else if(state=='2' && ( ch>='0' && ch<='7')){
            state='2';
            }
            else if(state=='2' && ((ch>='A' && ch<='Z')||(ch>='8' && ch<='9'))){
            state='3';
            }
            else if (state == '3' && ((ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9'))) {
                state = '3';
            }
            
        }
        if(state=='2'){
        accepted=true;
        }else{
        accepted=false;
        }
return accepted;
}
    

    public static void main(String[] args) {
        Q1_BKH1825010F_Automata ob = new Q1_BKH1825010F_Automata();
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
          System.out.println("binary="+ob.binary_number(input));
        System.out.println("decimal="+ob.decimal(input));
        System.out.println("hexa="+ob.hexaDecimal(input));
        System.out.println("octal="+ob.octal(input));
    }
}
/**
 * **
 *
 * q<1>@<sanzida2514@student.nstu.edu.bd>#2021
 *
 ***
 */
