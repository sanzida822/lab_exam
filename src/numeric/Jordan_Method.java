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
public class Jordan_Method {




    static int performOpr(float a[][], int n) {  //funtion reduce matrix 
        int i, j, k = 0, c , m = 0, flag = 0;

        for (i = 0; i < n; i++) {
            if (a[i][i] == 0) {
                c = 1;
            
            while ((i + c) < n && a[i + c][i] == 0) {
                c++;
                if ((i + c) == n) {
                    flag = 1;
                    break;

                }
                for (j = i, k = 0; k <= n; k++) {
                    float temp = a[j][k];
                    a[j][k] = a[j + c][k];
                    a[j + c][k] = temp;

                }
            
            
            for (j = 0; j < n; j++) {
                if (i != j) {
                    float p = a[j][i] / a[i][i];
                    for(k=0;k<=n;k++){
                    a[j][k]=a[j][k]-(a[i][k])*p;

                }
            }}
            }}
        }
            
        return flag;
    }

    public static void PrintResult(float a[][], int n, int flag) {

        System.out.println("Result::");
    
            for (int i = 0; i < n; i++) {
                System.out.println("x" + (i + 1) + "=" + a[i][n] / a[i][i] + ",");

            }

        }

    

    public static void main(String[] args) {
        float a[][] = {{1, 2, -3, 4},
        {1, 3, 1, 10},
        {1, -2, 5, 4}
        };
        int flag = 0, n = 3;
        flag=performOpr(a,n);

        PrintResult(a, n, flag);

    }
}
