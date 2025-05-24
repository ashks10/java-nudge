class KongThr1 extends Thread {
    public void run() {
        while(true) {
            try {
                Thread.sleep(200);
            }catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Good Morning");
        }
    }
}
class KongThr2 extends Thread{
    public void run(){
        while(true){
            try {
                Thread.sleep(200);
            }catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Welcome");
        }
    }
}

public class Practise {
    public static void main(String[] args) {
        KongThr1 kt1 = new KongThr1();
        kt1.setPriority(6);
        System.out.println(kt1.getPriority());
        //kt1.start();

        KongThr2 kt2 = new KongThr2();
        kt2.setPriority(9);
        System.out.println(kt2.getPriority());
        // getting the state of the thread
        System.out.println(kt2.getState());
        kt2.start();
        System.out.println(kt2.getState());
        System.out.println(Thread.currentThread().getState());
    }
}
