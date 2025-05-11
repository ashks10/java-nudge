
class TommyVecetti{

    public void hit(){
        System.out.println("hitting...");
    }

    public void run(){
        System.out.println("Running...");
    }

    public void fire(){
        System.out.println("firing...");
    }
}

public class Rockstargames {
    public static void main(String[] args) {
        TommyVecetti game = new TommyVecetti();

        game.fire();
        game.hit();
        game.run();
    }
}
