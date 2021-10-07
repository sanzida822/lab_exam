
//Sanzida Sultana
//BKH1825010f
package lab_exam;

public class Array_Print {

    /* public static void printArray(Integer[] inputArr) {
        for (Integer i : inputArr) {
            System.out.println("" + i);

        }
        System.out.println("");
    }

    public static void printArray(Double[] inputArr) {
        for (Double i : inputArr) {
            System.out.println("" + i);

        }
        System.out.println("");
    }

    public static void printArray(Character[] inputArr) {
        for (Character i : inputArr) {
            System.out.println("" + i);

        }
        System.out.println("");
    }

    public static void printArray(String[] inputArr) {
        for (String i : inputArr) {
            System.out.println("" + i);

        }
        System.out.println("");
    }
     */
    public static <T> void printArray(T[] inputArr) {
        for (T ele : inputArr) {
            System.out.println(ele);

        }
        System.out.println("");

    }

    public static <T extends Comparable<T>> T getMax(T[] anArray) {
        T max = anArray[0];
        for (int i = 0; i < anArray.length; i++) {
            if (anArray[i].compareTo(max) == 1) {
                max = anArray[i];
            }
        }

        return max;

    }

    public static void main(String[] args) {
        Integer[] intArry = {1, 2, 3, 4, 5};
        Double[] doubArry = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
        String[] strArray = {"once", "upon", "a", "time"};
        printArray(intArry);
        printArray(doubArry);
        printArray(charArray);
        printArray(strArray);
        System.out.println(getMax(intArry));
        System.out.println(getMax(doubArry));
        System.out.println(getMax(charArray));
        System.out.println(getMax(strArray));

    }
}
