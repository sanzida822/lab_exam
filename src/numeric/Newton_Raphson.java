/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeric;

/**
 *
 * @author Arafat
 */
public class Newton_Raphson {
      public static double limit=10;
        public static double esp=1e-2;
        public static float[] a={1,0,-3,-2};  //original eqution
        public static float[] DFe={3,0,-3}; //differential equation
    public static void main(String[] args) {
        int i=0;
         float x=0;
        while(true){
           
        float Xnext=x-(f(x)/Df(x));
            System.out.println(Xnext);
        i++;
        if(i>limit){
        break;}
        if(Math.abs(f(x))<esp){
            System.out.println("ans:"+Xnext);
            break;
        }
        x=Xnext;
        }
      
    }
    public static float f(float x){
        float p=a[0];
        for(int i=1;i<a.length;i++){
        p=p*x+a[i];
        }
    return p;
    }
     public static float Df(float x){
        float p=DFe[0];
        for(int i=1;i<DFe.length;i++){
        p=p*x+DFe[i];
        }
    return p;
    }
    
}
