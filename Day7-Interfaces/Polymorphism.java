interface MyCamera {
    void TakeSnap();
    void RecordVideo();

    default void Capture4kvideo() {
        System.out.println("Recording in 4k ...");
    }
}

interface Wifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellphone{
    void callNumber(int phonenumber){
        System.out.println("calling "+ phonenumber);
    }
    void PickCall(){
        System.out.println("Connecting...");
    }
}

class MySmartphone extends MyCellphone implements MyCamera,Wifi{
    @Override
    public void TakeSnap() {
        System.out.println("Taking a snap");
    }

    @Override
    public void RecordVideo() {
        System.out.println("Recoridng an SD video");
    }

    @Override
    public String[] getNetworks() {
        System.out.println("Setting up Connection Port");
        String[] networkList = { "ashish" , "lokesh" , "sonam"};
        return networkList;
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("connecting to "+network);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
      //  MySmartphone ms = new MySmartphone();

//        String[] ar = ms.getNetworks();
//        for (String item: ar){
//            System.out.println(item);
//        }

        MyCamera mc = new MySmartphone();   //this is polymorphism im literaly calling an interface with specific funcitoning
        mc.RecordVideo();

    }
}
