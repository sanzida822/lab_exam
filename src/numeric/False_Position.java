package numeric;

public class False_Position {

    public static double esp = 1e-4;
    public static double limit = 10;  //limit is 10
    public static float[] a = {1, -1, -2}; //x^2-x-2

    public static void main(String[] args) {

        float a = 1;
        float b = 3;
        int i = 0;
       
        while (true) {
            float c = a - f(a) * ((b - a) / (f(b) - f(a)));     
            System.out.println(c);
            float d = f(a) * f(c);
            if (Math.abs(f(c)) < esp) {
                System.out.println("Ans:" + c);
                break;

            } else if (d > 0) {
                a = c;
            } else {
                b = c;
            }
            i++;
            if (i > limit) {
                break;
            }

        }
    }

    public static float f(float x) {
        float y = a[0];
        for (int i = 1; i < a.length; i++) {
            y = y * x + a[i];
        }
        return y;

    }
}
