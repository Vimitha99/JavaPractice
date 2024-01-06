abstract class A {
    public abstract void run();
}

class B extends A{

    @Override
    public void run() {
        System.out.println("Running...");
    }
}
public class InheritenceExample {
    public static void main(String[] args) {

    A a = new B();
    a.run();

    }
}
