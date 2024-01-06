import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class CalcAvgLatency {
    public void calcLatency(String fileName){
        try{
            FileInputStream fstream = new FileInputStream(fileName);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            int total=0;
            int lineCount=0;
            while ((strLine = br.readLine()) != null)   {
                lineCount++;
                String[] str = strLine.split(":");
                int latency = Integer.parseInt(str[1].trim());
                total = total+latency;
            }
            System.out.println("Average latency: "+total/lineCount);
            fstream.close();

        }
        catch (Exception e){
            System.err.println("Error: " + e.getMessage());
        }

    }
    public static void main(String[] args) {
        CalcAvgLatency calcAvgLatency = new CalcAvgLatency();
        calcAvgLatency.calcLatency("/Users/vimitha/Documents/JavaPractice/src/main/java/demo.log");
    }
}
