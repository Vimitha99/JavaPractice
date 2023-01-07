class Box{
    int height;
    int width;
}
public class Practice {
    public static void main(String[] args) {
        Box b1=new Box();
        Box b2=b1;
        b2.height=10;
        b1.height=20;
        b1.width=30;
        System.out.println(b1.height);
        System.out.println(b2.height);
        System.out.println(b1.width);
        System.out.println(b2.width);


    }
}
