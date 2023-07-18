import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        float sum = 0.0F;
        float total = 0.0F;

        for(int i = 0; i<20; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String subject = st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String result = st.nextToken();

            if(result.equals("A+")) total += score * 4.5;
            else if(result.equals("A0")) total += score * 4.0;
            else if(result.equals("B+")) total += score * 3.5;
            else if(result.equals("B0")) total += score * 3.0;
            else if(result.equals("C+")) total += score * 2.5;
            else if(result.equals("C0")) total += score * 2.0;
            else if(result.equals("D+")) total += score * 1.5;
            else if(result.equals("D0")) total += score * 1.0;
            else if(result.equals("F")) total += score * 0.0;
            else continue;

            sum += score;
        }

        System.out.println(String.format("%7.6f",  total / sum));


    }
}
