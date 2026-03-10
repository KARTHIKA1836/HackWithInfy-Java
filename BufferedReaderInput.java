import java.io.InputStreamReader;
import java.io.BufferedReader;
public class BufferedReaderInput {
    public static void main(String[] args) throws Exception {
        BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
        String str=bfr.readLine();
        System.out.println(str);
        
    }
}
