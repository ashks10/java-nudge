class MyThre1 extends Thread{
    public void run(){
        int i=0;
        while (i<10){
            System.out.println("Thank you " );
            i++;
        }
    }
}
class MyThre2 extends Thread{
    public void run(){
        int i =0;
        while (i<5){
            System.out.println("so much Thank you " );
            i++;
        }
    }
}
public class Thread_Methods {
    public static void main(String[] args) {
        MyThre1 t1 = new MyThre1();
        MyThre2 t2 = new MyThre2();
        t1.start();
        try{
            t1.join();
        }catch (Exception e){
            System.out.println(e);
        }
        //t1.join(); //used to run t2 when t1 is finished
        t2.start();
    }
}
