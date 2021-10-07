package lab_exam;

//Sanzida Sultana
//BKH1825010f
public class Thread_demo implements Runnable {

    Thread_demo() {

        Thread_demo ob = new Thread_demo();
        Thread t = new Thread(ob);
        t.start();

    }

    public  void run() {
        System.out.println("hhhhh");
    }

    public static void main(String[] args) {
Thread_demo ob=new Thread_demo();
    //ob. Thread_demo();
    }

}