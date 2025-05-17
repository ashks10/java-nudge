package thisuper;

class Pearson{
    int a;

    public int getA() {
        return a;
    }

    Pearson(int v){
        this.a = v;
    }
     public int returnone(){
        return 1;
    }
}

class Management extends Pearson{
    Management(int c){
        super(c);
        System.out.println("I am a constructor");
    }
}

public class Main {
    public static void main(String[] args) {
        Pearson pearson = new Pearson(5);
        System.out.println(pearson.getA());

        Management mange = new Management(45);
    }
}
