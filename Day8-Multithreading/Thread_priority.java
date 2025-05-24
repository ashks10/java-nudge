class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
        int i =54;
        while (true){
            System.out.println("Thank you " + this.getName());
        }
    }
}

public class Thread_priority {
    public static void main(String[] args) {
        //ready queue : T1 T2 T3 T4 T5
        //JAVA.LANG.Thread.MIN_PRIORITY =1;
         //NORM_PRIORITY = 5;
        //MAX_PRIORITY = 10;
        MyThr1 mt1 = new MyThr1("APPLE");
        MyThr1 mt2 = new MyThr1("SAMSUNG");
        MyThr1 mt3 = new MyThr1("HUWAI (important)");
        MyThr1 mt4 = new MyThr1("BMW");
        mt3.setPriority(Thread.MAX_PRIORITY);
        mt4.setPriority(Thread.MIN_PRIORITY);
        mt1.start();
        mt2.start();
        mt3.start();
        mt4.start();


    }
}
