package string;

public class StringDemo {
    public int countLength(String str){
        int count=0;

        for(char a: str.toCharArray()){
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "hello good morning";
        StringDemo stringDemo = new StringDemo();
        int len = stringDemo.countLength(str);
        System.out.println(len);
    }
}
