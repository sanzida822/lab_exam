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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Arafat
 */
public class Q4_BKH1825010F_Automata {
    public boolean validVariable(String s){
        boolean accept=false;
        int a,d=3;
    Pattern p=Pattern.compile("[a-zA-Z]\\w*");
    Matcher m=p.matcher(s);
    if(m.find()){
    accept=true;   
    }
    return accept;
    }
    public static void main(String[] args) {
       Q4_BKH1825010F_Automata ob=  new Q4_BKH1825010F_Automata(); 
       Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
       ob.validVariable(input);
        System.out.println("variable="+ob.validVariable(input));
    }
}
/**
 * **
 *
 * q<1>@<sanzida2514@student.nstu.edu.bd>#2021
 *
 ***
 */
