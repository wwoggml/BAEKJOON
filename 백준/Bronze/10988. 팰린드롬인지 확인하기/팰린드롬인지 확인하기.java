import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        StringBuffer sb= new StringBuffer(word);

        if(word.equals(sb.reverse().toString())) System.out.println(1);
        else System.out.println(0);

    }
}
