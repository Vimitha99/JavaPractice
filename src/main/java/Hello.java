public class Hello {

    public void printHello(String str){
        char[] c = str.toCharArray();
        for (int i=0;i<=c.length;i++) {
            System.out.println(str.substring(0,i));
        }
    }

    public static void main(String[] args) {
        String str="Hello";
        Hello hello = new Hello();
        hello.printHello(str);
    }
}
