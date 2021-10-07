
package numeric;

import java.util.Scanner;

/**
 *
 * @author Arafat
 */
public class NewtonRaphson {
    public static void main(String[] args) {
        double x0=0;
        double answer=0;
        double root[] =new double[10];
       // System.out.println("Enter value of x0:");
       // Scanner scan=new Scanner(System.in);
       // x0=scan.nextDouble();
        
        for(int i=1;i<=10;i++){
        root[i]= x0-(F(x0)/Fprime(x0));
        if(Math.abs(Math.abs(root[i])- Math.abs(root[i-1]))<.05){
        answer=root[i];
        break;
        }
        
        }
        System.out.println("Root:"+answer);
    }
    public  static double F(double x){
     return Math.pow(x, 3)- 3*x -2;                                 //x^3-3*x-2
    
    }
    public static double Fprime(double x){
    return 3*Math.pow(x, 2) - 3;    //3x^2-3
    
    
    }
 
}
