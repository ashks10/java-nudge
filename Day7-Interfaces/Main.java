
interface sampleinterface {
        void meth1();
        void meth2();
}

interface childsampleinterface extends sampleinterface{
    void meth3();
    void meth4();
}

class MySampleClass implements childsampleinterface{
    @Override
    public void meth3() {
        System.out.println("meth 3");
    }

    @Override
    public void meth4() {
        System.out.println("meth 4");
    }

    @Override
    public void meth1() {
        System.out.println("meth 2");
    }

    @Override
    public void meth2() {
        System.out.println("meth 1");
    }
}

public class Main {
    public static void main(String[] args) {

    }
}
