class MyThread1 extends Thread{
    public void run(){
        int i = 0;
        while(i<2000){
            System.out.println("My cooking Thread is running");
            System.out.println("I am happyyyyy");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    public void run(){
        int i = 0;
        while(i<2000){
            System.out.println("Thread 2 forchating with her");
            System.out.println("i am very sad");
            i++;
        }
    }
}

public class Runnable {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        t1.start();
        MyThread2  t2 = new MyThread2();
        t2.start();
    }
}
