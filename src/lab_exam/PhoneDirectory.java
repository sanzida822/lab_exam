
package lab_exam;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class PhoneDirectory {
   public static TreeMap<String,Integer> phoneEntry=new TreeMap<>();
    public static void phone(){
    phoneEntry.put("Sanzida", 1);
    phoneEntry.put("Nitu",2);
     for(Map.Entry<String,Integer> map:phoneEntry.entrySet()){
         System.out.println(map.getKey());
         System.out.println(map.getValue());
     
     }
    
    }
    public static void main(String[] args) {
        phone();
     //  Scanner scan=new Scanner(System.in) ;
    }
    
}
