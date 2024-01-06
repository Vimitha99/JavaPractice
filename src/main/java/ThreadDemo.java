class Add extends Thread{
    int value;
public void run(){
    value=1+2;
}
        }
class Mul extends Thread{
    int value;
    public void run(){
        value=1*2;
    }
}


public class ThreadDemo {
    public static void main(String[] args) {
      ThreadDemo res = new ThreadDemo();

    }

}
