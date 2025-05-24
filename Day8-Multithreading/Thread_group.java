class MyTh extends Thread{
    MyTh(ThreadGroup group , String name){
        super(group , name);
    }
    public void run(){
        for(int i = 0 ; i<5;i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("Thread Exception" + getName());
            }
            System.out.println("Thread " + getName() + ",Iteration " + i);
        }
    }
}
public class Thread_group {
    public static void main(String[] args) {
        ThreadGroup group1 = new ThreadGroup("First group");
        ThreadGroup group2 = new ThreadGroup("Second group");

        MyTh thread1 = new MyTh(group1,"Thread -1");
        thread1.start();

        System.out.println(group1.getName());
    }
}
