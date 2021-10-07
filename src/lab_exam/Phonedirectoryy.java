
package lab_exam;

import java.util.Map;
import java.util.TreeMap;


public class Phonedirectoryy {
   private static TreeMap<String,String> phone;
   public Phonedirectoryy(){
   phone=new TreeMap<String,String>();
   
   }
   public String getName(String name){
   return phone.get(name);
   }
   public void phoneNumber(String name,String number){
   if(name==null||number ==null){
   
       System.out.println("Wrong");
   }
   phone.put(name, number);
   }
   public void print(){
   
   for(Map.Entry<String,String> entry:phone.entrySet()){
       System.out.println(entry.getKey()+" "+entry.getValue());
   }
       
   }
    public static void main(String[] args) {
     Phonedirectoryy ob=new Phonedirectoryy();
     phone.put("sanzida","018168229946");
     phone.put("nitu", "018938743894");
     ob.print();
     
    }
}
