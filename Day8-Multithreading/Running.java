import java.lang.Runnable;

class MyThreadRunnable1 implements Runnable{
    public void run(){
        System.out.println("I Am Thread 1 not a thread 1");
    }
}

class MyThreadRunnable2 implements Runnable{
    public void run(){
        System.out.println("I Am Thread 2 not a thread 2");
    }
}

public class Running {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);
// thread is gun and runnable is bullet
        gun1.start();
        gun2.start();
    }
}
