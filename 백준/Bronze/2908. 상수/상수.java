import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = st.nextToken();
        String B = st.nextToken();

        StringBuffer sbA = new StringBuffer(A).reverse();
        StringBuffer sbB = new StringBuffer(B).reverse();

        if(Integer.parseInt(String.valueOf(sbA)) > Integer.parseInt(String.valueOf(sbB)))
            System.out.println(Integer.parseInt(String.valueOf(sbA)));
        else System.out.println(Integer.parseInt(String.valueOf(sbB)));
    }
}
