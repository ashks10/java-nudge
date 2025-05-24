class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i = 45;
        System.out.println("Thank you");
//        while(true){
//            System.out.println("I am A  thread");
//        }
    }
}
public class thread_constructor {
    public static void main(String[] args) {
        MyThr t = new MyThr("Ashish");
        MyThr t2 = new MyThr("Harry");
        t.start();
        t2.start();
        System.out.println("The user id is : " + t.getId());
        System.out.println("The user id is : " + t2.getId());

        System.out.println("the name of the thread t is : " +t.getName());
        System.out.println("the name of the thread t2 is : " +t2.getName());

    }
}
